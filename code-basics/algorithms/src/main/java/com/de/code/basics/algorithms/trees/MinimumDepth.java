package com.de.code.basics.algorithms.trees;

public class MinimumDepth<T> {
    Node<T> root;

    public int minimumDepth(){
        return minimumDepth(root);
    }

    private int minimumDepth(Node node){

        if(node == null)
            return 0;
        else if(node.left == null && node.right == null)
            return 1;
        else if(node.left == null)
            return minimumDepth(node.right) +1;
        else if(node.right == null)
            return minimumDepth(node.left) +1;
        else
            return Math.min(minimumDepth(node.left)+1,minimumDepth(node.right)+1);
    }
}
