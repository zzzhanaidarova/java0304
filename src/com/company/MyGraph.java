package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class MyGraph<T> {
    private boolean undirected;
    private Map<T, List<T>> map = new HashMap<>();

    public MyGraph() {
        map = new HashMap<T, List<T>>();
    }

    public MyGraph(boolean undirected){
        this.undirected = undirected;
        map = new HashMap<>();
    }

    public void addVertex(T vertex){
        map.put(vertex, new LinkedList<>());
    }

    public void addEdge(T source, T dest){
        if (!map.containsKey(source)) addVertex(source);

        if (!map.containsKey(dest)) addVertex(dest);

        if (undirected) map.get(dest).add(source);
    }

    public int getVerticesCount(){
        return map.keySet().size();
    }

    public int getEdgesCount(){
        int c=0;
        for(T vertex : map.keySet()){
            c += map.get(vertex).size();
        }
        return c;
    }
    public boolean hasVertex(T vertex){
        if (map.containsKey(vertex)) return true;
        else return false;
    }

    public boolean hasEdge(T source, T dest){
        if(map.get(source).contains(dest)) return true;
        else return false;
    }

    /*public Iterable<Vertex> adj(){

    }*/
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (T v : map.keySet()){
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)){
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }

}