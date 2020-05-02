package com.de.code.basics.algorithms.trees;

public class Node<T> {
    T data;
    Node left,right;
    Integer hd;

    public Node(T data) {
        this.data = data;
        left = right  = null;
        hd = Integer.MAX_VALUE;
    }


}
