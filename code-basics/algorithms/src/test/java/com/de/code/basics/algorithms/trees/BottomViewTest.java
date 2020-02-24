package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BottomViewTest extends ConsoleFixture {

    private BottomView tree;
    @Before
    public void setUp() throws Exception {
        super.setUp();
        tree = new BottomView();
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
        super.tearDown();
    }

    @Test
    public void display() {
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        System.out.println("Bottom view of the given binary tree:");
        tree.display();
        assertEquals("Bottom view of the given binary tree:\n" +
                "5\n" +
                "10\n" +
                "4\n" +
                "14\n" +
                "25\n",console());
    }
}