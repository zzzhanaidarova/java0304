package com.company;

public class Edge<Vertex> {
    private Vertex source;
    private Vertex dest;
    private Double weight;

    public Edge(Vertex source, Vertex dest, Double weight){
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDest() {
        return dest;
    }

    public Double getWeight() {
        return weight;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
