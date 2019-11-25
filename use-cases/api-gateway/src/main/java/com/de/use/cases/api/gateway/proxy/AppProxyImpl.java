package com.de.use.cases.api.gateway.proxy;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.undertow.server.HttpHandler;
import io.undertow.server.handlers.proxy.LoadBalancingProxyClient;
import io.undertow.server.handlers.proxy.ProxyHandler;

import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppProxyImpl implements AppProxy{

    private static final Logger LOG = Logger.getLogger(AppProxyImpl.class.getName());
    private Map<String, HttpHandler> proxyHandlers = new ConcurrentHashMap<>();
    private Map<String, LoadBalancingProxyClient> proxyClients = new ConcurrentHashMap<>();
    private List<Service> services;

    public AppProxyImpl(final List<Service> services) {
        this.services = services;
        init();
    }

    @Override
    public void init() {
        this.services.forEach(service -> {
            LoadBalancingProxyClient client = new LoadBalancingProxyClient();
            service.getHosts().forEach(host -> {
                try {
                    client.addHost(new URI(host.getURI()));
                } catch (URISyntaxException e) {
                    LOG.log(Level.FINE, "unable to create proxy client" + service.getService() + " for host" + host.getFQDN());
                }
                LOG.log(Level.INFO, "host "+host.getFQDN()+" added for service " + service.getService());
            });
            client.setConnectionsPerThread(20);
            proxyClients.put(service.getService(), client);
            LOG.log(Level.INFO, " proxy client created for service " + service.getService());
        });
    }

    @Override
    public void updateService(final String serviceName, final List<Host> hosts) {

    }

    @Override
    public Map<String, HttpHandler> getProxyHandlers() {
        this.proxyClients.forEach((service, client) -> {
            this.proxyHandlers.put(service, ProxyHandler.builder().setProxyClient(client).setMaxRequestTime(30000).build());
        });
        return this.proxyHandlers;
    }
}
