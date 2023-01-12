import java.util.*;

public class Graphs {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    public static void main(String args[]) {
        Graphs g = new Graphs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        //g.BFS(2);
        boolean[] visited = new boolean[4];
        g.DFS(2, visited);
    }

    Graphs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int v) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v + " ");
            for (Integer n : adj[v]) {
                if (!visited[n]) {

                    visited[n] = true;
                    queue.add(n);

                }
            }
        }
    }

    void DFS(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (Integer n : adj[v]) {
            if (!visited[n]) {
                DFS(n, visited);
            }
        }
    }
}
