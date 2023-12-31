package Graphs;
import java.util.*;

public class Dijkstra{

    static void dijkstra(int[][] mat, int v, int V){
        int[] distances = new int[V];
        PriorityQueue<Tuple> queue = new PriorityQueue<>();

        for (int i = 0; i < distances.length; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        queue.add(new Tuple(v, 0));
        distances[v] = 0;

        while(!queue.isEmpty()){
            int cur = queue.poll().vertex;
            for (int i = 0; i < V; i++) {
                if(mat[cur][i] == Integer.MAX_VALUE) continue;
                int w = mat[cur][i];
                int newDist = distances[cur] + w;
                if(newDist < distances[i]){
                    distances[i] = newDist;
                    queue.add(new Tuple(i, newDist));
                }
            }
        }
        _Graphs.printArray(distances);
    }

    static class Tuple implements Comparable<Tuple>{
        int vertex;
        int distance;
        public Tuple(int v, int d) {
          vertex = v;
          distance = d;
        }

        @Override public int compareTo(Tuple other) {
            return distance - other.distance;
          } 
    }
}

