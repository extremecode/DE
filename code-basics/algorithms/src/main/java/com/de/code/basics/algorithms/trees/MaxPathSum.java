package com.de.code.basics.algorithms.trees;

public class MaxPathSum {
    Node<Integer> root;

    class Res{
        int val;
    }

    private int maxUtil(Node<Integer> node,Res res){
        if(node == null)
            return 0;

        int l = maxUtil(node.left,res);
        int r = maxUtil(node.left,res);

        int max_single = Math.max(node.data,node.data+Math.max(l,r));
        res.val = Math.max(max_single,l+r+node.data);

        return max_single;
    }

    public int maxUtil(Node<Integer> node){

        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        return maxUtil(node,res);
    }


}
