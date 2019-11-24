package com.de.use.cases.web.common.http;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

import java.io.IOException;

public class HttpRequestImpl implements HttpRequest {

    private CloseableHttpClient httpClient;
    private HttpGet request;
    private String URI;

    public HttpRequestImpl(CloseableHttpClient httpClient, String URI) {
        this.httpClient = httpClient;
        this.URI = URI;
        init();
    }

    @Override
    public HttpRequest init() {
        request = new HttpGet(this.URI);
        return this;
    }

    @Override
    public HttpRequest addHeader(final String key, final String value) {
        request.addHeader(key, value);
        return this;
    }

    @Override
    public HttpResponse execute() throws IOException {
        return new HttpResponseImpl(this.httpClient.execute(this.request));
    }
}
