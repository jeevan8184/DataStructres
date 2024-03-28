package Graphs;

import java.util.*;

public class cheapestFlights {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Info {
        int n, cost, stops;

        public Info(int n, int c, int s) {
            this.n = n;
            this.cost = c;
            this.stops = s;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int flights[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    public static void cheapestFlight(int flights[][], int k, int src, int dest, int n) {
        // same as dijkstra
        int mstCost = 0;
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph, flights);
        int dist[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }
            for (int i = 0; i < graph[curr.n].size(); i++) {
                Edge e = graph[curr.n].get(i);
                if (curr.stops <= k && curr.cost + e.wt < dist[e.dest]) {
                    // dist[e.dest]=curr
                }

            }

        }

    }

    public static void main(String[] args) {
        int n = 4;
        int src = 0, dest = 3, k = 1;
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };

    }
}
