package com.grokkeking.twopointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestWindowSortTest {

    @Test
    public void getMinWindowSize() {
        assertEquals(5,new ShortestWindowSort().getMinWindowSize(new int[]{1, 2, 5, 3, 7, 10, 9, 12}));
        assertEquals(5,new ShortestWindowSort().getMinWindowSize(new int[]{1, 3, 2, 0, -1, 7, 10}));
        assertEquals(0,new ShortestWindowSort().getMinWindowSize(new int[]{1, 2, 3}));
        assertEquals(3,new ShortestWindowSort().getMinWindowSize(new int[]{3,2,1}));
    }
}