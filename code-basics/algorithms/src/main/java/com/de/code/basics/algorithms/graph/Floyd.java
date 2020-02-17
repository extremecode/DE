package com.de.code.basics.algorithms.graph;

public class Floyd {
    private int V;
    public static int INF=99999;

    public void init(int v){
        this.V = v;
    }

    public int[][] shortest(int[][] graph, int V) {
        int dist[][] = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for (int k = 0; k < V; k++)
            for (int i = 0; i < V; i++)
                for (int j = 0; j < V; j++){
                    if(dist[i][k]+dist[k][j]<dist[i][j])
                        dist[i][j] = dist[i][k]+dist[k][j];
                }

        return dist;
    }

    void printSolution(int dist[][])
    {
        System.out.println("The following matrix shows the shortest "+
                "distances between every pair of vertices");
        for (int i=0; i<V; ++i)
        {
            for (int j=0; j<V; ++j)
            {
                if (dist[i][j]==INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
}