package Graphs;

import java.util.*;

public class DFS {

    static void dfs(LinkedList<Integer> adj[], int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (Integer n : adj[v]) {
            if (!visited[n]) {
                dfs(adj, n, visited);
            }
        }
    }
}
