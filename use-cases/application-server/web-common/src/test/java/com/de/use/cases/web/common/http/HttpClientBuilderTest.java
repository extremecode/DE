package com.de.use.cases.web.common.http;


import org.junit.After;
import org.junit.Before;

public class HttpClientBuilderTest {

    private HttpClientBuilder httpClient;
    private HttpResponse response;

    @Before
    public void setUp() throws Exception {
        httpClient = new HttpClientBuilderImpl();
    }

    @After
    public void tearDown() throws Exception {
        httpClient = null;
        response = null;
    }

//    @Test
//    public void home() throws IOException {
//        response = this.httpClient.get("http://16.78.63.172:32870/home")
//                        .addHeader("token","csrf")
//                        .execute();
//        assertEquals(200,response.getStatusCode());
//    }
//
//    @Test
//    public void pnfex() throws IOException {
//        response = this.httpClient.get("http://16.78.63.172:32870/pnfex")
//                .addHeader("token","csrf")
//                .execute();
//        assertEquals(500,response.getStatusCode());
//    }

}
