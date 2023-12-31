package Graphs;
import java.util.*;

public class BFS {

    static void bfs(int[][] mat, int v, int V) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v + " ");
            for (int i = 0; i < V; i++) {
                if(mat[v][i] == Integer.MAX_VALUE) continue;
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
