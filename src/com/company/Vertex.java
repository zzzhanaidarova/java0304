package com.company;

import java.util.Map;

public class Vertex <V>{
    private V data;
    private Map<Vertex<V>, Double > adjacentVertices; // with weight

    public void addAdjacentVertex(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }
}
