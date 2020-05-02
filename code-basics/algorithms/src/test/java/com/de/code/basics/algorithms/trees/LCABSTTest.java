package com.de.code.basics.algorithms.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCABSTTest {

    private LCABST tree;

    @Before
    public void setUp() throws Exception {
        tree = new LCABST();
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
    }

    @Test
    public void lca() {
        tree.root = new Node<>(20);
        tree.root.left = new Node<>(8);
        tree.root.right = new Node<>(22);
        tree.root.left.left = new Node<>(7);
        tree.root.left.right = new Node<>(12);
        tree.root.left.right.left = new Node<>(10);
        tree.root.left.right.right = new Node<>(14);

        assertEquals(8,tree.lca(tree.root,8,14).data);
        assertEquals(12,tree.lca(tree.root,10,14).data);
    }
}