package com.grokkeking.fastandslowpointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfLinkedListTest {

    @Test
    public void find() {
        ListNode root = new ListNode(0);
        root.next = new ListNode(1);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(4);
        assertEquals(2,new MiddleOfLinkedList().find(root).getData());
        root.next.next.next.next.next = new ListNode(5);
        assertEquals(3,new MiddleOfLinkedList().find(root).getData());
    }
}