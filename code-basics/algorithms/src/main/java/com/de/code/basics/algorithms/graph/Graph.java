package com.de.code.basics.algorithms.graph;

import java.util.LinkedList;

public class Graph {
    public static final int NIL = -1;
    protected int V;
    protected LinkedList<Integer> adj[];

    public Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for(int i=0; i<v; i++)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void addUnDirectedEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public int getV() {
        return V;
    }

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

}
