package com.grokkeking.fastandslowpointers;

import com.de.code.basics.algorithms.trees.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCheckerTest {

    @Test
    public void hasCycle() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);
        assertFalse(new LinkedListChecker().hasCycle(root));
        root.next.next.next.next.next.next = root.next.next ;
        assertTrue(new LinkedListChecker().hasCycle(root));
    }

    @Test
    public void getCycleLength() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);
        assertEquals(0,new LinkedListChecker().getCycleLength(root));
        root.next.next.next.next.next.next = root.next.next ;
        assertEquals(4,new LinkedListChecker().getCycleLength(root));
    }

    @Test
    public void getCycleStartNode() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);
        assertEquals(0,new LinkedListChecker().getCycleLength(root));
        root.next.next.next.next.next.next = root.next.next ;
        assertEquals(3,new LinkedListChecker().getCycleStartNode(root).getData());
    }
}