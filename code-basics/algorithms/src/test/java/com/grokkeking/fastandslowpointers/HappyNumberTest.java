package com.grokkeking.fastandslowpointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void find() {
        assertTrue(new HappyNumber().find(23));
        assertFalse(new HappyNumber().find(12));
    }
}