package com.de.code.basics.algorithms.graph;

import java.util.LinkedList;

public class BFS {

    private Graph graph;

    public BFS init(Graph graph){
        this.graph = graph;
        return this;
    }

    public void traverse(int s) {
        Boolean[] visited = new Boolean[this.graph.getV()];

        for(int i=0; i<this.graph.getV(); i++)
            visited[i] = false;

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(s);
        visited[s] = true;

        while (queue.size()!=0){
            int v = queue.poll();
            System.out.println(v+" ");
            this.graph.getAdj()[v].forEach(child->{
                if(!visited[child]) {
                    queue.add(child);
                    visited[child] = true;
                }
            });
        }
    }

}
