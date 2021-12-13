package com.grokkeking.fastandslowpointers;

public class ListNode {

    private int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }
}
