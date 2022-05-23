package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class MyGraph<Vertex> {
    private boolean undirected;
    private Map<Vertex, List<Vertex>> map = new HashMap<>();
    private Map<Vertex, List<Vertex>> adj = new HashMap<>();

    public MyGraph() {
        map = new HashMap<Vertex, List<Vertex>>();
        adj = new HashMap<Vertex, List<Vertex>>();
    }

    public MyGraph(boolean undirected){
        this.undirected = undirected;
        map = new HashMap<>();
        adj = new HashMap<>();
    }

    public void addVertex(Vertex vertex){
        map.put(vertex, new LinkedList<>());
        adj.put(vertex, new LinkedList<>());
    }

    public void addEdge(Vertex source, Vertex dest){
        if (!hasVertex(source)) addVertex(source);

        if (!hasVertex(dest)) addVertex(dest);

        if (hasEdge(source, dest) || source.equals(dest)) return;

        map.get(source).add(dest);

        if (undirected) map.get(dest).add(source);
    }

    public int getVerticesCount(){
        return map.keySet().size();
    }

    public int getEdgesCount(){
        int c=0;
        for(Vertex vertex : map.keySet()){
            c += map.get(vertex).size();
        }
        return c;
    }
    public boolean hasVertex(Vertex vertex){
        if (map.containsKey(vertex)) return true;
        else return false;
    }

    public boolean hasEdge(Vertex source, Vertex dest){
        if(map.get(source).contains(dest)) return true;
        else return false;
    }

    public Iterable<Vertex> adj(Vertex vertex) {
        if (!adj.containsKey(vertex)) return null;
        return adj.get(vertex);
    }

}