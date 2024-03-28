package Graphs;

import java.util.*;

public class Topological_Sort {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    // using dfs O(V+E)
    public static void topSortd(ArrayList<Edge>[] graph) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtild(graph, vis, s, i);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtild(ArrayList<Edge>[] graph, boolean vis[], Stack<Integer> s, int curr) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtild(graph, vis, s, e.dest);
            }
        }
        s.push(curr);
    }

    // using bfs O(V+E)
    public static void indegree(ArrayList<Edge>[] graph, int ind[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                ind[e.dest]++;
            }
        }
    }

    public static void topSortb(ArrayList<Edge> graph[]) {
        int ind[] = new int[graph.length];
        indegree(graph, ind);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < ind.length; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                ind[e.dest]--;
                if (ind[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topSortd(graph);
        System.out.println();
        topSortb(graph);
    }
}
