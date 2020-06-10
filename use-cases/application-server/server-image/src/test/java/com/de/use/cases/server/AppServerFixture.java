package com.de.use.cases.server;

import com.de.use.cases.web.common.http.HttpClientBuilderImpl;
import com.de.use.cases.web.common.http.SystemFixture;


import java.util.Properties;

public class AppServerFixture extends SystemFixture {


    protected static final String HOST = System.getProperty("app.web.server.net.HOST_NAME", "localhost");
    protected static final String EXTERNAL_ACCESS_HOST = HOST;
    protected static final int EXTERNAL_ACCESS_PORT = Integer.getInteger("app.web.server.test.port.http", 443);
    protected static final int HTTP_PORT = Integer.getInteger("app.web.server.test.port.http", 8080);
    protected static final int HTTPS_PORT = Integer.getInteger("app.web.server.test.port.https", 8443);


    public AppServerFixture() {

    }

    public void init(){
        Properties properties = new Properties();
        properties.put("host",HOST);
        properties.put("http.port",HTTP_PORT);
        properties.put("http.type","http");
        super.init(properties);
    }



}
