package com.company;

import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyGraph<Vertex>{
    private final boolean undirected;
    private Map<Vertex, List<Vertex>> map = new HashMap<>();

    public MyGraph() {
    }

    public MyGraph(boolean undirected){

    }

    public void addVertex(Vertex vertex){
        map.put(vertex, new LinkedList<>());
    }

    public void addEdge(Vertex source, Vertex dest){

    }

    public int getVerticesCount(){
        return map.size();
    }

    public int getEdgesCount(){

    }

    public boolean hasVertex(Vertex vertex){

    }

    public boolean hasEdge(Vertex source, Vertex dest){

    }

    public Iterable<Vertex> adj(){
        
    }
}
