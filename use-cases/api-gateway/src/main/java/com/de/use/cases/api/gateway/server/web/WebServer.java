package com.de.use.cases.api.gateway.server.web;

import com.de.use.cases.api.gateway.server.Server;
import com.de.use.cases.api.gateway.server.ServerOptions;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class WebServer implements Server {


    private int port ;
    private String hostname ;
    private Undertow.Builder builder;
    private Undertow server;
    private List<HttpHandler> handlers;

    public WebServer(final String hostname, final int port) {
        this.builder = Undertow.builder();
        this.hostname = hostname;
        this.port = port;
        this.handlers = new ArrayList<>();
    }

    @Override
    public Server init(ServerOptions ...options) {
        for(ServerOptions option:options){
            switch (option){
                case HTTP: this.builder.addHttpListener(this.port,this.hostname); continue;
                case HTTPS: this.builder.addHttpsListener(this.port,this.hostname,getSSLContext()); continue;
            }
        }
        return this;
    }

    @Override
    public Server addHandler(HttpHandler handler) {
        this.handlers.add(handler);
        return this;
    }

    @Override
    public Server build() {
        handlers.forEach(handler -> {
            this.builder.setHandler(handler);
        });
        server = this.builder.build();
        return this;
    }

    @Override
    public void start() {
        this.server.start();
    }

    @Override
    public void stop() {
        this.server.stop();
    }


    public static SSLContext getSSLContext() {
        try {
            return SSLContext.getDefault();
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
