package com.grokkeking.slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharReplacementTest {

    @Test
    public void find() {
        assertEquals(5,new CharReplacement().find("aabccbb",2));
        assertEquals(4,new CharReplacement().find("abbcb",1));
        assertEquals(3,new CharReplacement().find("abccde",1));

    }
}