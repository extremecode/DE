package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPathSumTest extends ConsoleFixture {
    private MaxPathSum tree;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        tree = new MaxPathSum();
    }

    @After
    public void tearDown() throws Exception {

        tree = null;
        super.tearDown();
    }

    @Test
    public void maxUtil() {


        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(1);
        tree.root.right.right = new Node(-25);
        tree.root.right.right.left = new Node(3);
        tree.root.right.right.right = new Node(4);
        System.out.println("maximum path sum is : " +
                tree.maxUtil(tree.root));
        assertEquals("maximum path sum is : 32\n",console());
    }
}