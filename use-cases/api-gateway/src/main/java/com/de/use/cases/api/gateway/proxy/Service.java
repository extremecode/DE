package com.de.use.cases.api.gateway.proxy;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private String service;
    private List<Host> hosts;

    public Service(String service) {
        this.service = service;
        this.hosts = new ArrayList<>();
    }

    public List<Host> getHosts() {
        return this.hosts;
    }

    public void addHost(String FQDN, int port){
        this.hosts.add(new Host(FQDN,port));
    }


    public String getService() {
        return service;
    }

}

