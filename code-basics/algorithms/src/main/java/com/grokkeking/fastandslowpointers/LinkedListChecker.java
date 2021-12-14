package com.grokkeking.fastandslowpointers;

import java.util.NoSuchElementException;

public class LinkedListChecker {
    public boolean hasCycle(ListNode root){
        ListNode slow = root;
        ListNode fast = root;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

    public int getCycleLength(ListNode root){
        ListNode slow = root;
        ListNode fast = root;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                return calculateLength(slow);
        }
        return 0;
    }

    public ListNode getCycleStartNode(ListNode root){
        int cycleLength = this.getCycleLength(root);
        if(cycleLength>0){
            ListNode pointer = root;
            ListNode fastPointer = root;
            while (cycleLength>0){
                fastPointer = fastPointer.next;
                cycleLength--;
            }
            while (pointer!=fastPointer){
                pointer = pointer.next;
                fastPointer = fastPointer.next;
            }
            return pointer;
        }else {
            throw new NoSuchElementException("there is no cycle in source provided");
        }
    }

    private int calculateLength(ListNode slow){
        int cycleLength = 0;
        ListNode current = slow;
        do{
            current = current.next;
            cycleLength++;
        }while (current!=slow);
        return cycleLength;
    }
}
