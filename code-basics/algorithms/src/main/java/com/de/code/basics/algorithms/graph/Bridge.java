package com.de.code.basics.algorithms.graph;

public class Bridge {
    private Graph graph;

    int time = 0;

    public Bridge init(Graph graph){
        this.graph = graph;
        return this;
    }

    private void bridgeUtil(int u,boolean[] visited,int[] parent,int[] disc,int[] low){
        visited[u] = true;

        disc[u] = low[u] = ++time;

        this.graph.getAdj()[u].forEach(v->{
            if(!visited[v]){
                parent[v] = u;
                bridgeUtil(v,visited,parent,disc,low);

                low[u] = Math.min(low[u],low[v]);

                if(low[v]>disc[u])
                    System.out.println(u+"--"+v);

            }else if(v!=parent[u]){
                low[u] = Math.min(low[u],disc[v]);
            }
        });

    }

    public void bridge(){
        boolean[] visited = new boolean[this.graph.getV()];
        int[] disc = new int[this.graph.getV()];
        int[] low = new int[this.graph.getV()];
        int[] parent = new int[this.graph.getV()];

        for(int i=0; i<this.graph.getV(); i++){
            parent[i] = this.graph.NIL;
            visited[i] = false;
        }

        System.out.println(" Bridgres in the graph");

        for(int i=0; i<this.graph.getV(); i++){
            if(!visited[i])
                bridgeUtil(i,visited,parent,disc,low);
        }


    }
}
