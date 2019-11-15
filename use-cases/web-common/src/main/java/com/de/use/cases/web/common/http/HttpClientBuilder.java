package com.de.use.cases.web.common.auth.jwt;

import java.io.IOException;

public interface HttpClientBuilder {
    void init();
    HttpRequest get(String URI);
    HttpRequest post(String URI);
    void close() throws IOException;
}
