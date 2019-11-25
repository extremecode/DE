package com.de.use.cases.api.gateway.server.web;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class BasicHttpHandler implements HttpHandler {

    private String serverName;

    public BasicHttpHandler(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        exchange.getResponseSender().send(this.serverName);
    }
}
