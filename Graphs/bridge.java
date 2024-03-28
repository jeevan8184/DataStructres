package Graphs;

import java.util.*;

public class bridge {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));
        // graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 1));
        // graph[4].add(new Edge(4, 5, 1));

        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
    }

    // briges in graph O(V+E) same as dfs
    public static void dfs(ArrayList<Edge>[] graph, int curr, int par, int dt[],
            int low[], int time, boolean vis[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (neigh == par) {
                continue;
            } else if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, time, vis);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (dt[curr] < low[neigh]) {
                    System.out.println(curr + "--" + neigh);
                }
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }
    }

    public static void bridgesGraph(ArrayList<Edge>[] graph, int V) {
        boolean vis[] = new boolean[V];
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, time, vis);
            }
        }
    }

    // Articulation point
    public static void dfsA(ArrayList<Edge>[] graph, int curr, int par, int dt[], int low[], int time, boolean vis[],
            boolean ap[]) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;
            if (par == neigh) {
                continue;
            } else if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfsA(graph, neigh, curr, dt, low, time, vis, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }
                child++;
            }
        }
        if (par == -1 && child > 1) {
            ap[curr] = true;
        }

    }

    public static void ArticulationPt(ArrayList<Edge>[] graph, int V) {
        boolean vis[] = new boolean[graph.length];
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean ap[] = new boolean[V];
        int time = 0;
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfsA(graph, i, -1, dt, low, time, vis, ap);
            }
        }
        for (int i = 0; i < ap.length; i++) {
            if (ap[i]) {
                System.out.print("AP : ");
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        bridgesGraph(graph, V);
        System.out.println();
        ArticulationPt(graph, V);
        System.err.println();
    }
}
