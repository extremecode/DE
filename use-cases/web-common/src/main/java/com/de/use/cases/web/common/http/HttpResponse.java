package com.de.use.cases.web.common.http;

import java.io.IOException;

public interface HttpResponse {
    int getStatusCode();
    String getBody() throws IOException;
    void close() throws IOException;
}
