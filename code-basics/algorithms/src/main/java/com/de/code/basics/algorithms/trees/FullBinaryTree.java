package com.de.code.basics.algorithms.trees;

public class FullBinaryTree {
    Node<Integer> root;
    public boolean check(Node node){

        if(node == null)
            return true;

        if(node.left == null && node.right == null)
            return true;

        if(node.left!=null && node.right!= null)
            return ((check(node.left))&&(check(node.right)));

        return false;
    }
}
