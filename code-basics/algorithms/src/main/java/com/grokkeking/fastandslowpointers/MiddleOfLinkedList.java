package com.grokkeking.fastandslowpointers;

import com.de.code.basics.algorithms.trees.Node;

public class MiddleOfLinkedList {
    public ListNode find(ListNode root){
        ListNode slow = root,fast = root;
        do{
            slow = slow.next;
            fast = fast.next.next;
        }while (fast!=null && fast.next!=null);
        return slow;
    }
}
