package com.de.code.basics.algorithms.graph.mst;

public class Edge implements Comparable<Edge> {
    int weight, src,dst;

    @Override
    public int compareTo(Edge compareEdge) {
        return weight - compareEdge.weight;
    }
}
