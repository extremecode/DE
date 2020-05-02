package com.de.code.basics.algorithms.graph;

import java.util.concurrent.atomic.AtomicInteger;

public class Articulation {
    private Graph graph;
    public static final int NIL = -1;
    int time =0;

    public Articulation init(Graph graph) {
        this.graph = graph;
        return this;
    }

    private  void AP(int u, boolean[] visited,boolean[] ap ,int[] disc,int[] low,int[] parent){
        AtomicInteger children= new AtomicInteger();
        visited[u] = true;

        disc[u] = low[u] = ++time;

        this.graph.getAdj()[u].forEach(v->{
            if(!visited[v]){
                children.getAndIncrement();
                parent[v] = u;
                AP(v,visited,ap,disc,low,parent);

                low[u] = Math.min(low[u],low[v]);

                if(parent[u]== NIL && children.get()>1)
                    ap[u] = true;

                else if(parent[u] !=NIL && low[v]>=disc[u])
                    ap[u] = true;
            }
            else if(v!=parent[u])
                low[u] = Math.min(low[u],disc[v]);
        });

    }

    public void AP(){
        boolean[] visited = new boolean[this.graph.getV()];
        boolean[] ap = new boolean[this.graph.getV()];
        int[] parent = new int[this.graph.getV()];
        int[] disc = new int[this.graph.getV()];
        int[] low = new int[this.graph.getV()];

        for(int i=0; i<this.graph.getV(); i++){
            visited[i] = false;
            ap[i] = false;
            parent[i] = NIL;
        }

        for(int i=0; i<this.graph.getV(); i++){
            if(!visited[i])
                AP(i,visited,ap,disc,low,parent);

        }

        for(int i=0; i<this.graph.getV(); i++){
            if(ap[i])
               System.out.println(i+" ");
        }



    }
}
