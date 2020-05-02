package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopViewTest extends ConsoleFixture {

    private TopView tree;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        tree = new TopView();
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
        super.tearDown();
    }

    @Test
    public void display() {
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.right = new Node(6);
        System.out.println("Following are nodes in top view of Binary Tree");
        tree.display();
        assertEquals("Following are nodes in top view of Binary Tree\n" +
                "2\n" +
                "1\n" +
                "3\n" +
                "6\n",console());
    }
}