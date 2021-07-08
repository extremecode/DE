package com.de.use.cases.web.common.http;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;


public class HTTPClientFixture {

    private final Integer HTTP_PORT=new Integer(2345);
    private final Integer HTTPS_PORT=new Integer(2346);

    @Rule
    WireMockRule wireMock = new WireMockRule(options().port(HTTP_PORT).httpsPort(HTTPS_PORT));

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }



}
