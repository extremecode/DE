package com.de.code.basics.algorithms.graph;

public class DFS {

    private Graph graph;

    public DFS init(Graph graph){
        this.graph = graph;
        return this;
    }

    private void DFSUtil(int v,boolean[] visited){
        visited[v] = true;

        System.out.println(v+" ");

        this.graph.getAdj()[v].forEach(child->{
            if(!visited[child])
                DFSUtil(child,visited);
        });

    }

    public void traverse(int source){
        boolean[] visited = new boolean[this.graph.getV()];


        DFSUtil(source,visited);
    }
}
