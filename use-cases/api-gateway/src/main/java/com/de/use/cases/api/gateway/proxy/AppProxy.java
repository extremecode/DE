package com.de.use.cases.api.gateway.proxy;

import io.undertow.server.HttpHandler;

import java.util.List;
import java.util.Map;

public interface AppProxy {
    void init();
    void updateService(final String serviceName,final List<Host> hosts);
    Map<String, HttpHandler> getProxyHandlers();
}
