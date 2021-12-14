package com.grokkeking.fastandslowpointers;

import com.de.code.basics.algorithms.trees.Node;

public class PalindromeLinkedList {
    public boolean check(ListNode head){
       if(head==null || head.next == null)
           return true;

       ListNode slow = new MiddleOfLinkedList().find(head);

       ListNode headOfSecondHalf = LinkedListHelper.INSTANCE.reverse(slow);
       ListNode copyOfSecondHalf = headOfSecondHalf;

       while (head!=null && headOfSecondHalf!=null){
           if(head.getData()!=headOfSecondHalf.getData())
               return false;
           head = head.next;
           headOfSecondHalf = headOfSecondHalf.next;
       }

        LinkedListHelper.INSTANCE.reverse(copyOfSecondHalf);
        if(head==null || headOfSecondHalf == null )
            return true;
        return false;
    }

}
