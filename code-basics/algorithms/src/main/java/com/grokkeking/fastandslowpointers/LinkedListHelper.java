package com.grokkeking.fastandslowpointers;

public enum LinkedListHelper {
    INSTANCE;

    private LinkedListHelper() {
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}
