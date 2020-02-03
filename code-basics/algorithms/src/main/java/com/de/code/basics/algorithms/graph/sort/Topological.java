package com.de.code.basics.algorithms.graph.sort;

import com.de.code.basics.algorithms.ds.Stack;

import java.util.LinkedList;

public class Topological {
    private Integer V;
    LinkedList<Integer> adj[];

    public void init(Integer V){
        this.V = V;
        this.adj = new LinkedList[this.V];
        for(int i=0; i<this.V; i++)
            this.adj[i] = new LinkedList<>();
    }

    public void addEdge(int u, int v){
        this.adj[u].add(v);
    }

    private void  sort(boolean[] visited,Stack stack,int node){

        this.adj[node].forEach(child->{
            sort(visited,stack,child);
        });

        if(visited[node] == false) {
            stack.push(node);
            visited[node] = true;
        }

    }

    public void sort(){
        boolean[] visited = new boolean[this.V];
        Stack stack = new Stack();
        for(int i=0; i<this.V; i++){
            visited[i] = false;
        }


        for(int i=0; i<this.V; i++){
            sort(visited,stack,i);
        }

        for(int i=0; i<this.V; i++){
            System.out.print(stack.pull()+" ");
        }

    }


}
