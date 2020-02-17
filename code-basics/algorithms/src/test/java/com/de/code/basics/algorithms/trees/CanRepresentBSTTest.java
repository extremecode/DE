package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ds.BinaryIndexTree;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CanRepresentBSTTest {


    private CanRepresentBST bst;
    @Before
    public void setUp() throws Exception {
        bst = new CanRepresentBST();
    }

    @After
    public void tearDown() throws Exception {
        bst = null;
    }

    @Test
    public void check() {
        int[] pre1 = new int[]{40, 30, 35, 80, 100};
        assertEquals(true,bst.check(pre1,pre1.length));
    }
}