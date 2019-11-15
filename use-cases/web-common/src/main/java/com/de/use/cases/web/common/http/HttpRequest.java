package com.de.use.cases.web.common.http;

import java.io.IOException;

public interface HttpRequest {
    HttpRequest init();
    HttpRequest addHeader(final String key,final String value);
    HttpResponse execute() throws IOException;
}
