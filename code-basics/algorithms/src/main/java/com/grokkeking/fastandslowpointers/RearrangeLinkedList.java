package com.grokkeking.fastandslowpointers;

public class RearrangeLinkedList {
    public ListNode get(ListNode head){
        if(head == null || head.next== null)
            return head;

        ListNode slow = new MiddleOfLinkedList().find(head);
        ListNode headOfSecondHalf = LinkedListHelper.INSTANCE.reverse(slow);

        ListNode headOfFirstHalf = head;

        while (headOfFirstHalf!=null && headOfSecondHalf!=null){
            ListNode temp = headOfFirstHalf.next;
            headOfFirstHalf.next = headOfSecondHalf;
            headOfFirstHalf = temp;

            temp = headOfSecondHalf.next;
            headOfSecondHalf.next = headOfFirstHalf;
            headOfSecondHalf = temp;
        }

        if(headOfFirstHalf!=null)
            headOfFirstHalf.next = null;
        return head;
    }
}
