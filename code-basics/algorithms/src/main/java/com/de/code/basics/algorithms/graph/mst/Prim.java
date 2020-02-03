package com.de.code.basics.algorithms.graph.mst;

public class Prim {

    private  int V;
    public void init(int V){
        this.V = V;
    }

    public int minKey(boolean[] mstset,int key[]){
        int min = Integer.MAX_VALUE,min_index = -1;

        for(int i=0; i<this.V; i++){
            if(mstset[i] == false && key[i]<min){
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public void prim(int[][] graph){
        int[] parent = new int[this.V];
        int[] key = new int[this.V];

        boolean[] mstset = new boolean[this.V];

        for(int i=0; i<this.V; i++){
            mstset[i] = false;
            key[i] = Integer.MAX_VALUE;
        }

        key[0] = 0;

        parent[0] = -1;

        for(int count=0; count<V-1; count++){
            int u = minKey(mstset,key);

            mstset[u] = true;

            for(int v=0; v<this.V; v++){
                if(graph[u][v] !=0 && mstset[v] ==false && graph[u][v]<key[v]){
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent,graph);

    }

    void printMST(int parent[], int graph[][])
    {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

}
