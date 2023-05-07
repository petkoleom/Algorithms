package Graphs;

import java.util.*;

public class _Graphs {
    static private int V; // No. of vertices
    static private LinkedList<Integer> adj[]; // Adjacency Lists

    public static void main(String args[]) {
        _Graphs g = new _Graphs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        boolean[] visited = new boolean[V];
        //BFS.bfs(adj, 2, 4);
        DFS.dfs(adj, 2, visited);
    }

    _Graphs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

}
