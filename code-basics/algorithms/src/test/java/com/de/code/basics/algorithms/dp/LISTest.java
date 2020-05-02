package com.de.code.basics.algorithms.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LISTest {

    LIS lis;

    @Before
    public void setUp() throws Exception {
        lis = new LIS();
    }

    @After
    public void tearDown() throws Exception {
        lis = null;
    }

    @Test
    public void lisDP() {
        int arr[] = {1,3,2,4};
        assertEquals(3,lis.lisDP(arr,arr.length));
    }
}