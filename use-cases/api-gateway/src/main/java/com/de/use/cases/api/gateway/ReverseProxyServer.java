package com.de.use.cases.api.gateway;

import com.de.use.cases.api.gateway.proxy.AppProxy;
import com.de.use.cases.api.gateway.proxy.AppProxyImpl;
import com.de.use.cases.api.gateway.proxy.Host;
import com.de.use.cases.api.gateway.proxy.Service;
import com.de.use.cases.api.gateway.server.Server;
import com.de.use.cases.api.gateway.server.ServerOptions;
import com.de.use.cases.api.gateway.server.web.BasicHttpHandler;
import com.de.use.cases.api.gateway.server.web.WebServer;
import io.undertow.Undertow;

import io.undertow.server.HttpHandler;
import io.undertow.server.handlers.proxy.LoadBalancingProxyClient;
import io.undertow.server.handlers.proxy.ProxyHandler;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


public class ReverseProxyServer {

    public static void main(final String[] args) throws URISyntaxException {

        List<Service> services = new ArrayList<>();
        Service serviceX = new Service("Service X");
        serviceX.addHost("localhost",8081);
        serviceX.addHost("localhost",8082);
        serviceX.addHost("localhost",8083);
        services.add(serviceX);


        services.forEach(service ->{
            service.getHosts().forEach(host -> {
                final Server server = new WebServer(host.getFQDN(),host.getPort())
                        .init(ServerOptions.HTTP)
                        .addHandler(new BasicHttpHandler(service.getService()+" hosted at "+host.getURI())).build();
                server.start();
            });

        });

        final Server reverseProxy = new WebServer("localhost",8080)
                                    .init(ServerOptions.HTTP)
                                    .addHandler(new AppProxyImpl(services).getProxyHandlers().get(serviceX.getService())).build();

        reverseProxy.start();

    }

}
