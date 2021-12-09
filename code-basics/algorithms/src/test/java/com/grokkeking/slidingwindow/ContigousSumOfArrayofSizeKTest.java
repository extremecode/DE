package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContigousSumOfArrayofSizeKTest {

    @Test
    public void find() {
        assertEquals(9,new ContigousSumOfArrayofSizeK().find(3,new int[]{2, 1, 5, 1, 3, 2}));
    }
}