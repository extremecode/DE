package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ConsoleFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNodesTest extends ConsoleFixture {

    private RemoveNodes tree;

    @Before
    public void setUp() throws Exception {
        tree = new RemoveNodes();
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
        tree = null;
    }

    @Test
    public void removeShortPathNodes() {

        int k = 4;
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(8);
        System.out.println("The inorder traversal of original tree is : ");
        tree.printInorder(tree.root);
        Node res = tree.removeShortPathNodes(tree.root, k);
        System.out.println("");
        System.out.println("The inorder traversal of modified tree is : ");
        tree.printInorder(res);
        assertEquals("The inorder traversal of original tree is : \n" +
                "7 4 2 5 1 3 8 6 \n" +
                "The inorder traversal of modified tree is : \n" +
                "7 4 2 1 3 8 6 ",console());

    }
}