package com.de.use.cases.api.gateway.proxy;

public class Host {


    private String FQDN;
    private int port;

    public Host(String FQDN, int port) {

        this.FQDN = FQDN;
        this.port = port;
    }

    public String getFQDN() {
        return FQDN;
    }

    public int getPort() {
        return port;
    }

    public String getURI() {
        return "http://"+this.FQDN+":"+this.port;
    }
}
