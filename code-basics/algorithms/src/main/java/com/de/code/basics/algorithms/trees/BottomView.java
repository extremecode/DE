package com.de.code.basics.algorithms.trees;

import com.de.code.basics.algorithms.ds.Queue;

import java.util.TreeMap;

public class BottomView {
    Node<Integer> root;

    int hd = 0;

    public void display() {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        Queue<Node> queue = new Queue<>();

        root.hd = hd;
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.remove();
            map.put(temp.hd,(Integer) temp.data);

            hd = temp.hd;
            if(temp.left!=null){
                temp.left.hd = temp.hd-1;
                queue.add(temp.left);
            }

            if(temp.right!=null){
                temp.right.hd = temp.hd+1;
                queue.add(temp.right);
            }
        }

        map.forEach((k,v)->{
            System.out.println(v);
        });
    }
}
