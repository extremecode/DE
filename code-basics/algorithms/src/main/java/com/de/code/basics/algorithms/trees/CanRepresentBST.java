package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ds.Stack;

public class CanRepresentBST {
    public boolean check(int[] pre,int n)
    {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            if(pre[i]<root){
                return false;
            }

            if(!stack.isEmpty() && stack.peek()<pre[i]){
                root = stack.pull();
            }

            stack.push(pre[i]);
        }

        return true;
    }

}
