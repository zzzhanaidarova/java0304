package com.company;

public class Main {

    public static void main(String[] args) {
        MyGraph<Integer> graph = new MyGraph<>(true);

        graph.addVertex(0);
        graph.addEdge(10, 0);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        for (int i = 1; i < 6; i++) {
            graph.addEdge(i + 1, i);
        }

        System.out.println("Graph:\n" + graph.toString());
        System.out.println("--------");

        System.out.println("Edges count = " + graph.getEdgesCount());
        System.out.println("Vertices count = " + graph.getVerticesCount());
    }
}
