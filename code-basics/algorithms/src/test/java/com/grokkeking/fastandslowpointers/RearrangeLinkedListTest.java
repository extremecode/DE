package com.grokkeking.fastandslowpointers;

import org.junit.Test;

import static org.junit.Assert.*;

public class RearrangeLinkedListTest {

    @Test
    public void get() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        assertEquals("2->12->4->10->6->8->NULL",print(new RearrangeLinkedList().get(head)));
        head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        assertEquals("2->10->4->8->6->NULL",print(new RearrangeLinkedList().get(head)));

    }

    public String print(ListNode head){
        StringBuilder builder = new StringBuilder("");
        while (head!=null){
            builder.append(head.getData()).append("->");
            head = head.next;
        }
        builder.append("NULL");
        return builder.toString();
    }

}