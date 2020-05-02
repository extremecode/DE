package com.de.code.basics.algorithms.graph.mst;

public class Edge implements Comparable<Edge> {
    int weight, src,dst;

    public Edge() {
        this.weight = 0;
        this.src = 0;
        this.dst = 0;
    }

    @Override
    public int compareTo(Edge compareEdge) {
        return weight - compareEdge.weight;
    }
}
