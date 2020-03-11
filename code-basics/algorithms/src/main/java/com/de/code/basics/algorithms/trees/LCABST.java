package com.de.code.basics.algorithms.trees;

public class LCABST {
    Node<Integer> root;

    public Node lca(Node<Integer> node,int n1, int n2){
        if(node==null)
            return null;
        if(node.data>n1 && node.data>n2)
            return lca(node.left,n1,n2);

        if(node.data<n1 && node.data<n2)
            return lca(node.right,n1,n2);

        return node;
    }
}
