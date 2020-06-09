package com.de.use.cases.web.common.http;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.Closeable;
import java.io.IOException;

public class HttpClientBuilderImpl implements HttpClientBuilder,Closeable {

    private CloseableHttpClient httpClient;

    public HttpClientBuilderImpl() {
        init();
    }

    @Override
    public void init() {
        httpClient = HttpClients.createDefault();
    }

    @Override
    public HttpRequest get(String URI) {
        return new HttpRequestImpl(this.httpClient,URI);
    }

    @Override
    public HttpRequest post(String URI) {
        return null;
    }

    @Override
    public void close() throws IOException {
        httpClient.close();
    }
}
