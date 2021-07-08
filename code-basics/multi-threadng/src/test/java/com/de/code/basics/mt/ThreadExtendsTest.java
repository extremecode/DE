package com.de.code.basics.mt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadExtendsTest extends ConsoleFixture{

    private ThreadExtends thread;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        thread = new ThreadExtends();
        thread.start();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }

    @Test
    public void run() {

    }

}