package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class NoRepetingSubStringTest {

    @Test
    public void find() {
        assertEquals(3,new NoRepetingSubString().find("abccde"));
        assertEquals(2,new NoRepetingSubString().find("abbbbb"));
    }
}