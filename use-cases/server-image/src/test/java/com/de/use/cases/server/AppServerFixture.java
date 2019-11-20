package com.de.use.cases.server;

import com.de.use.cases.web.common.http.HttpClientBuilder;
import com.de.use.cases.web.common.http.HttpClientBuilderImpl;
import com.de.use.cases.web.common.http.HttpRequest;
import com.de.use.cases.web.common.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class AppServerFixture {


    protected static final String HOST = System.getProperty("app.web.server.net.HOST_NAME", "localhost");
    protected static final String EXTERNAL_ACCESS_HOST = HOST;
    protected static final int EXTERNAL_ACCESS_PORT = Integer.getInteger("app.web.server.test.port.http", 443);
    protected static final int HTTP_PORT = Integer.getInteger("app.web.server.test.port.http", 8080);
    protected static final int HTTPS_PORT = Integer.getInteger("app.web.server.test.port.https", 8443);

    private HttpClientBuilder http;

    public AppServerFixture() {
        init();
    }

    public void init(){
        http = new HttpClientBuilderImpl();
    }

    public void destroy() throws IOException {
        http.close();
    }

    protected HttpRequest get(final String uri) {
        return this.http.get(uri);
    }

    protected HttpRequest post(final String uri,final String contentType,final String json) {
        return this.http.get(uri);
    }


    public void post(final String path,final String contentType,final String json, final TestAssertion<HttpResponse> consumer) {
        String uri = "https://" + HOST + ":" + HTTPS_PORT + path;

        try {
            final HttpResponse response = post(uri,contentType,json).execute();
            try {
                consumer.assertOutcome(response);
            } finally {
                response.close();
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void get(final String path, final TestAssertion<HttpResponse> consumer) {

        String uri = "https://" + HOST + ":" + HTTPS_PORT + path;

        try {
            final HttpResponse response = get(uri).execute();
            try {
                consumer.assertOutcome(response);
            } finally {
                response.close();
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
