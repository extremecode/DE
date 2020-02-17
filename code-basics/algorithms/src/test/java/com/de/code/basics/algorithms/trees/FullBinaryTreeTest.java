package com.de.code.basics.algorithms.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FullBinaryTreeTest {

    private FullBinaryTree tree;

    @Before
    public void setUp() throws Exception {
        tree = new FullBinaryTree();
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
    }

    @Test
    public void check() {

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.left.left = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.left = new Node(80);
        tree.root.right.right = new Node(70);
        tree.root.left.left.right = new Node(90);
        tree.root.left.right.left = new Node(80);
        tree.root.left.right.right = new Node(90);
        tree.root.right.left.left = new Node(80);
        tree.root.right.left.right = new Node(90);
        tree.root.right.right.left = new Node(80);
        tree.root.right.right.right = new Node(90);
        assertEquals(true,tree.check(tree.root));
    }
}