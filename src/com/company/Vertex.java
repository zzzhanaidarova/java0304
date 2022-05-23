package com.company;

import java.util.Map;

public class Vertex <Vertex>{
    private Vertex data;
    private Map<Vertex, Double > adjVertices; // with weight

    public void addAdjacentVertex(Vertex destination, double weight){
        adjVertices.put(destination, weight);
    }
}
