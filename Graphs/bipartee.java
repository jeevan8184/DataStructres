package Graphs;

import java.util.*;

public class bipartee {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraphBipartee(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
    }

    // Bipartee //same as bfs
    public static boolean isBipartee(ArrayList<Edge>[] graph) {
        int col[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                col[i] = 0;
                q.add(i);
            }
            while (!q.isEmpty()) {
                int curr = q.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e = graph[curr].get(j);
                    if (col[e.dest] == -1) {
                        int nextCol = col[curr] == 0 ? 1 : 0;
                        col[e.dest] = nextCol;
                        q.add(e.dest);
                    } else if (col[e.dest] == col[curr]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // 2.PrintAll paths

    public static void createGraphPaths(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));

    }

    public static void printAllPath(ArrayList<Edge>[] graph, int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path + e.src);
        }
    }

    public static void main(String[] args) {
        // int V = 6;
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraphBipartee(graph);
        System.out.println(isBipartee(graph));
        // 2.
        // createGraphPaths(graph);
        // printAllPath(graph, 5, 1, "");

    }
}
// DAG - directed acyclic graph
