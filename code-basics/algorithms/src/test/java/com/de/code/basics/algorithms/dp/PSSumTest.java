package com.de.code.basics.algorithms.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class PSSumTest {

    @Test
    public void DP() {
        int arr[] = {1, 6, 11, 5};
        assertEquals(1,new PSSum().DP(arr,arr.length));
    }
}