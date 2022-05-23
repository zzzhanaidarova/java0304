package com.company;

import java.util.*;

public class Search<Vertex> {
    protected int count;
    protected Set<Vertex> marked;
    protected Map<Vertex, Vertex> edgeTo;
    protected final Vertex source;

    public Search(Vertex source){
        this.source = source;
        marked = new HashSet<>();
        edgeTo = new HashMap<>();
    }

    public boolean hasPathTo(Vertex vertex){
        return marked.contains(vertex);
    }

    public Iterable<Vertex> pathTo(Vertex vertex){
        if (!hasPathTo(vertex)) return null;
        LinkedList<Vertex> list = new LinkedList<>();
        for(Vertex i=vertex; i!=source; i= edgeTo.get(i)){
            list.push(i);
        }
        list.push(source);
        return list;
    }

    public int getCount(){
        return count;
    }
}
