package com.company;

import sun.security.provider.certpath.Vertex;

public class Main {

    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>(true);

        graph.addEdge("Almaty", "Astana");
        graph.addEdge("Almaty", "Shymkent");
        graph.addEdge("Shymkent", "Astana");
        graph.addEdge("Astana", "Kostanay");
        graph.addEdge("Shymkent", "Kyzylorda");
    }

    public static void outputPath(Search<Vertex> search, Vertex key){
        for (Vertex vertex : search.pathTo(key)){
            System.out.println(vertex + " -> ");
        }
    }
}
