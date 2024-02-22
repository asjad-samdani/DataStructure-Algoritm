package Graphs;

import java.util.*;

public class CreateaGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;

        }

    }

    public static void main(String[] args) {
        int v = 5;
        // int arr[]= new arr[v];
        ArrayList<Edge>[] graph = new ArrayList[v]; // null ->empty arraylist
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        // 0 -> Vertex

        graph[0].add(new Edge(0, 1, 5));

        // 1 -> vertex

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -> Graph

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -> Graph

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 graph

        graph[4].add(new Edge(4, 2, 2));

        // 2 Neighours
        for(int i=0;i<graph[4].size();i++){
            Edge e= graph[4].get(i);// src dec wt
            System.out.println(e.dest);

        }
    }

}
