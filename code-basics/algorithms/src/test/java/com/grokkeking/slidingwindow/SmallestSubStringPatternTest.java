package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestSubStringPatternTest {

    @Test
    public void find() {
        assertEquals("abdec",new SmallestSubStringPattern().find("aabdec","abc"));
        assertEquals("abc",new SmallestSubStringPattern().find("abdabca","abc"));
        assertEquals("",new SmallestSubStringPattern().find("adcad","abc"));
    }
}