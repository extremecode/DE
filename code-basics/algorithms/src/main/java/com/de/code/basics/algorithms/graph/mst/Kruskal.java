package com.de.code.basics.algorithms.graph.mst;

import java.util.Arrays;

public class Kruskal extends Graph {

    public void kruskal() {
        Edge[] result = new Edge[this.V];

        int i = 0, e = 0;

        Arrays.sort(edge);

        Subset[] subset = new Subset[this.V];

        for(i=0;  i<this.V; i++){
            subset[i] = new Subset();
            subset[i].parent = i;
            subset[i].rank = 0;
        }

        i=0;

        while (e<V-1){
            Edge next_edge = new Edge();
            next_edge = edge[i++];

            int x = findRank(subset,next_edge.src);
            int y = findRank(subset,next_edge.dst);

            if(x!=y){
                result[e++] = next_edge;
                unionRank(subset,x,y);
            }
        }

        System.out.println("Following are the edges in " +
                "the constructed MST");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src+" -- " +
                    result[i].dst+" == " + result[i].weight);
    }

}
