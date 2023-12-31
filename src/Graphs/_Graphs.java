package Graphs;

import java.util.*;

public class _Graphs {
    static private int V;
    static private int E;
    static private int[][] matrix;

    static final int INF = 99999;

    public static void main(String args[]) {
        _Graphs g = new _Graphs(4);

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                matrix[i][j] = INF;
                if(i == j)  matrix[i][j] = 0;
            }
        }

        g.addEdge(0, 1, 1);
        g.addEdge(0, 2, 2);
        g.addEdge(1, 2, 4);
        g.addEdge(2, 0, 2);
        g.addEdge(2, 3, 3);
        g.addEdge(2, 1, 1);
        g.addEdge(3, 2, 2);

        E = 7;

        System.out.println("input:");
        printMatrix(matrix);
        System.out.println();

        boolean[] visited = new boolean[V];
        //BFS.bfs(matrix, 2, 4);
        //DFS.dfsRecursive(matrix, 2, 4, visited);
        //DFS.dfsIterative(matrix, 2, 4);
        //Dijkstra.dijkstra(matrix, 2, 4);
        //Floyd_Warshall.floydWarshall(matrix, V);
        //Kruskal.kruskal(matrix, V, E);
    }

    _Graphs(int v) {
        V = v;
        matrix = new int[v][v];

    }

    void addEdge(int v, int w, int weight) {
        matrix[v][w] = weight;
    }

    static void printMatrix(int[][] m){
        for (int i = 0; i < m.length; ++i) {
            for (int j = 0; j < m[i].length; ++j) {
                if (m[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(m[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static void printArray(int[] a){
        for (int j = 0; j < a.length; ++j) { 
            System.out.print(a[j] + "   ");
        }
    }

}
