package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinSizeSubArrayTest {

    @Test
    public void find() {
        assertEquals(2,new MinSizeSubArray().find(new int[]{2, 1, 5, 2, 3, 2},7));
        assertEquals(1,new MinSizeSubArray().find(new int[]{2, 1, 5, 2, 8},7));
        assertEquals(3,new MinSizeSubArray().find(new int[]{3, 4, 1, 1, 6},8));
    }
}