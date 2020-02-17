package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDepthTest extends ConsoleFixture {

    MinimumDepth tree;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        tree = new MinimumDepth<Integer>();
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
        super.tearDown();
    }

    @Test
    public void minimumDepth() {

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("The minimum depth of "+
                "binary tree is : " + tree.minimumDepth());

        assertEquals("The minimum depth of binary tree is : 2\n",console());
    }
}