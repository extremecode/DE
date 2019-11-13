package com.de.use.cases.server;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;

import static org.junit.Assert.*;

@Category(IntegrationTest.class)
public class AppServerTest {

    private AppServerFixture fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new AppServerFixture();
        fixture.init();
    }

    @After
    public void tearDown() throws Exception {
        fixture.destroy();
        fixture = null;
    }

    @Test
    public void home() {
        fixture.get("/home", response -> {
            assertEquals(200, response.getStatusCode());
        });
    }

    @Test
    public void pnfex() {
        fixture.get("/pnfex", response -> {
            assertEquals(500, response.getStatusCode());
        });
    }

}
