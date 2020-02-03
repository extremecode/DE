package com.de.code.basics.algorithms.graph.mst;

public class Graph {
    int V;
    int e;
    Edge edge[];

    public void init(int V,int e){
      this.e = e;
      this.V = V;
      edge = new Edge[this.e];
      for(int i=0; i<e; i++)
          edge[i] = new Edge();
    }

    class Subset{
        int parent;
        int rank;
    }

    public int findRank(Subset[] subset,int i){
        if(subset[i].parent==i)
            return i;
        return findRank(subset,subset[i].parent);
    }

    public void unionRank(Subset[] subset,int x, int y){
        int xroot=findRank(subset,x);
        int yroot=findRank(subset,y);
        if(subset[xroot].rank<subset[yroot].rank)
            subset[xroot].parent =yroot;
        else if(subset[yroot].rank<subset[xroot].rank)
            subset[yroot].parent =xroot;
        else {
            subset[yroot].parent =xroot;
            subset[xroot].rank++;
        }

    }

    public boolean iscycleRank(Graph graph){
        Subset[] subset = new Subset[graph.V];
        for(int i=0; i<graph.V; i++){
            subset[i] = new Subset();
            subset[i].parent = i;
            subset[i].rank = 0;
        }

        for(int i=0; i<graph.V; i++){
            int x = findRank(subset,graph.edge[i].src);
            int y = findRank(subset,graph.edge[i].dst);
            if(x==y)
                return true;
            graph.unionRank(subset,x,y);
        }
        return false;
    }

    public int find(int[] parent,int i){
        if(parent[i]==-1)
            return i;
        return find(parent,parent[i]);
    }

    public void union(int[] parent,int x, int y){
        int xset=find(parent,x);
        int yset=find(parent,y);
        parent[yset] = xset;
    }

    public boolean iscycle(Graph graph){
        int[] parent = new int[graph.V];
        for(int i=0; i<graph.V; i++)
            parent[i] = -1;
        for(int i=0; i<graph.V; i++){
            int x = find(parent,graph.edge[i].src);
            int y = find(parent,graph.edge[i].dst);
            if(x==y)
                return true;
            graph.union(parent,x,y);
        }
        return false;
    }

}
