package Graphs;

import java.util.*;

public class _Graphs {
    static private int V; // No. of vertices
    static private LinkedList<Integer> adj[]; // Adjacency Lists
    static private int[][] matrix;

    public static void main(String args[]) {
        _Graphs g = new _Graphs(4);

        g.addEdge(0, 1, 1);
        g.addEdge(0, 2, 2);
        g.addEdge(1, 2, 4);
        g.addEdge(2, 0, 2);
        g.addEdge(2, 3, 3);
        g.addEdge(3, 3, 1);
        g.addEdge(2, 1, 1);

        boolean[] visited = new boolean[V];
        //BFS.bfs(matrix, 2, 4);
        //DFS.dfsRecursive(matrix, 2, 4, visited);
        //DFS.dfsIterative(matrix, 2, 4);
        Dijkstra.dijkstra(matrix, 2, 4);
    }

    _Graphs(int v) {
        V = v;
        matrix = new int[v][v];
        for (int i = 0; i < v; ++i)
            matrix[i] = new int[v];
    }

    void addEdge(int v, int w, int weight) {
        matrix[v][w] = weight;
    }

}
