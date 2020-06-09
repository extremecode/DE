package com.de.use.cases.web.common.http;


import java.io.Closeable;
import java.io.IOException;
import java.util.Properties;

public class SystemFixture implements Closeable {

    private HttpClientBuilder http;
    private Properties properties;

    public SystemFixture() {
    }

    public void init(Properties properties){
        http = new HttpClientBuilderImpl();
    }

    public void close() throws IOException {
        http.close();
    }

    protected HttpRequest get(final String uri) {
        return this.http.get(uri);
    }

    protected HttpRequest post(final String uri,final String contentType,final String json) {
        return this.http.get(uri);
    }


    public void post(final String path,final String contentType,final String json, final TestAssertion<HttpResponse> consumer) {
        String uri = properties.getProperty("http.type")+"://" + properties.getProperty("host") + ":" + properties.getProperty("http.port") + path;

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

        String uri = properties.getProperty("http.type")+"://" + properties.getProperty("host") + ":" + properties.getProperty("http.port") + path;

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

