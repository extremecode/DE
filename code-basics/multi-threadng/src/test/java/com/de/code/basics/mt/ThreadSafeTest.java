package com.de.code.basics.mt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;


public class ThreadSafeTest {

    private ExecutorService executorService;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void run() {
        executorService = Executors.newFixedThreadPool(10);
        for(int i=0; i<100; i++){
            executorService.submit(new ThreadSafe(i));
        }

    }
}
