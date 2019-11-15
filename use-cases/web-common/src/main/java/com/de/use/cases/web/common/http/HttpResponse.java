package com.de.use.cases.web.common.auth.jwt;

import java.io.IOException;

public interface HttpResponse {
    int getStatusCode();
    String getBody() throws IOException;
    void close() throws IOException;
}
