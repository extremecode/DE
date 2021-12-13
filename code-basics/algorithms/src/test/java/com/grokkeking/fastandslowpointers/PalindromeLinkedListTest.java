package com.grokkeking.fastandslowpointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {

    @Test
    public void check() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        assertTrue(new PalindromeLinkedList().check(head));

        head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(3);
        assertTrue(new PalindromeLinkedList().check(head));

    }
}