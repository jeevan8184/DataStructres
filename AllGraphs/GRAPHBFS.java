package AllGraphs;

import java.util.*;

public class GRAPHBFS {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);

                }
            }
        }
    }

    // like tukde tukde ke liye bhi
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // all paths from source to target
    public static void printAllPaths(ArrayList<Edge> graph[], int target, int curr, boolean vis[], String path) {
        if (curr == target) {
            System.out.print(path + " ");
            System.out.println();
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                vis[curr] = true;
                printAllPaths(graph, target, e.dest, vis, path + e.dest);
                vis[curr] = false;
            }
        }
    }

    public static void main(String args[]) {
        int V = 7;

        // * */
        // 1 --- 3
        // / | \
        // 0 | 5--6
        // \ | /
        // 2 ---4
        //
        //
        //

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // boolean vis[]=new boolean[V];
        // for (int i=0;i<V;i++) {
        // if (vis[i]==false) {
        // dfs(graph, 0, vis);
        // }
        // }

        int src = 0;
        int target = 5;
        printAllPaths(graph, target, src, new boolean[V], "0");

    }

}
