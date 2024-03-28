package Graphs;

import java.util.*;

public class kruskal {
    static class Edge implements Comparable<Edge> {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;
        }
    }

    static int n = 7;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    // kruskal's algo
    public static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    public static void kruskalsMST(ArrayList<Edge> edges, int V) {
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int cnt = 0;
        for (int i = 0; cnt < V - 1; i++) {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.dest);
            if (parA != parB) {
                union(parA, parB);
                mstCost += e.wt;
                cnt++;
            }
        }
        System.out.println(mstCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        kruskalsMST(graph, V);

    }
}
