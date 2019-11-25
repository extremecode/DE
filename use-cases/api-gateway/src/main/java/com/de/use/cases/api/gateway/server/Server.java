package com.de.use.cases.api.gateway.server;

import io.undertow.server.HttpHandler;

public interface Server {
    Server init(ServerOptions ...options);
    Server addHandler(HttpHandler handler);
    Server build();
    void start();
    void stop();
}
