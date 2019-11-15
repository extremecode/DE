package com.de.use.cases.web.common.auth.jwt;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpResponseImpl implements HttpResponse{

    private CloseableHttpResponse response;

    public HttpResponseImpl(CloseableHttpResponse response) {
        this.response = response;
    }

    @Override
    public int getStatusCode() {
        return this.response.getStatusLine().getStatusCode();
    }

    @Override
    public String getBody() throws IOException {
        return EntityUtils.toString(this.response.getEntity());
    }

    @Override
    public void close() throws IOException {
        response.close();
    }
}
