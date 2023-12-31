package Graphs;
import java.util.*;

public class DFS {

    static void dfsRecursive(int[][] mat, int v, int V, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < V; i++) {
            if(mat[v][i] == Integer.MAX_VALUE) continue;
            if (!visited[i]) 
                dfsRecursive(mat, i, V, visited);
        }
    }

    static void dfsIterative(int[][] mat, int v, int V){
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[V];
            stack.push(v);
            while(!stack.isEmpty()){
                int cur = stack.pop();
                visited[cur] = true;
                System.out.print(cur + " ");
                for (int i = 0; i < V; i++) {
                    if(mat[cur][i] == Integer.MAX_VALUE) continue;
                    if(!visited[i])
                        stack.push(i);
                }
            }
    }
}
