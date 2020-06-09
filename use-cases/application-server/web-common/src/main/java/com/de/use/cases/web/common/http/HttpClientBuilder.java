package com.de.use.cases.web.common.http;

import java.io.Closeable;

public interface HttpClientBuilder extends Closeable{
    void init();
    HttpRequest get(String URI);
    HttpRequest post(String URI);
}
