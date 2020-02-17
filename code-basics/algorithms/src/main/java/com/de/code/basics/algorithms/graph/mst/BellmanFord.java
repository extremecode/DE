package com.de.code.basics.algorithms.graph.mst;

public class BellmanFord {
    private int V;
    private int E;

    Edge[] edge;

    public void init(int v, int e){
        this.V = v;
        this.E = e;
        edge = new Edge[this.E];
        for(int i = 0; i<this.E; i++)
            edge[i] = new Edge();
    }

    public void calculate(){
        int[] dist = new int[this.V];

        for(int i=0; i<this.V; i++)
            dist[i] = Integer.MAX_VALUE;

        dist[0] = 0;

        for(int i=0; i<this.V; i++)
            for(int j=0; j<this.V; j++){
                int u = this.edge[j].src;
                int v = this.edge[j].dst;
                int weight = this.edge[j].weight;
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v]){
                    dist[v]= weight+dist[u];
                }
            }

            for (int j = 0; j < this.V; j++) {
                int u = this.edge[j].src;
                int v = this.edge[j].dst;
                int weight = this.edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    System.out.println(" Graph Conatins Cycles");
                    return;
                }
            }

        printArr(dist);


    }

    void printArr(int dist[])
    {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < this.V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }


}
