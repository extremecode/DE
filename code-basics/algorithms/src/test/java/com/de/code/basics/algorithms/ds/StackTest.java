package com.de.code.basics.algorithms.ds;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack<Integer>();
    }

    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    @Test
    public void push() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(java.util.Optional.of(4),java.util.Optional.of(stack.pull()));
        assertEquals(java.util.Optional.of(3),java.util.Optional.of(stack.pull()));
        assertEquals(java.util.Optional.of(2),java.util.Optional.of(stack.pull()));
        assertEquals(java.util.Optional.of(1),java.util.Optional.of(stack.pull()));
    }
}