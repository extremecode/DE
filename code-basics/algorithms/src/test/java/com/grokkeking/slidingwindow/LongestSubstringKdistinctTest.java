package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringKdistinctTest {

    @Test
    public void find() throws IllegalAccessException {
        assertEquals(4,new LongestSubstringKdistinct().find("araaci",2));
        assertEquals(2,new LongestSubstringKdistinct().find("araaci",1));
        assertEquals(5,new LongestSubstringKdistinct().find("cbbebi",3));
    }
}