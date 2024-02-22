package Graphs;

import java.util.ArrayList;

public class Cycle {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static boolean detectedCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectedUtil(graph, vis, i, -1)) {
                    return true;
                    // cycle exists in one of the parts
                }

            }
        }
        return false;
    }

    // O(V+E)
    public static boolean detectedUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Case 3
            if (!vis[e.dest]) {
                if (detectedUtil(graph, vis, e.dest, curr)) {
                    return true;

                }
                // Node visited as well as it is not our parent then dest is true;
            } else if (vis[e.dest] && e.dest != par) {
                return true;

            }
            // case 2; Do nothing -> continue

        }
        return false;

    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(detectedCycle(graph));
    }

}
