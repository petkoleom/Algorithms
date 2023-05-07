package Graphs;

import java.util.*;

public class BFS {

    static void bfs(LinkedList<Integer> adj[], int v, int V) {
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
}
