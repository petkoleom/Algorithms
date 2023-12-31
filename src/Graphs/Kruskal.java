package Graphs;
import java.util.*;

import Graphs.Dijkstra.Tuple;

public class Kruskal {
    static void kruskal(int[][] mat, int V, int E){
        Edge[] edges = new Edge[E];
        int idx = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if(mat[i][j] != _Graphs.INF && mat[i][j] != 0){
                    edges[idx] = new Edge(i, j, mat[i][j]);
                    idx++;
                }   
            }
        }

        Arrays.sort(edges);
        ArrayList<Edge> mst = new ArrayList<>();
        int[] subsets = new int[V];
        Arrays.fill(subsets, -1);
        int i = 0;
        while(mst.size() < V - 1){
            Edge nextEdge = edges[i++];
      
            System.out.println(nextEdge.source + "  " + nextEdge.target);
            int x = find(subsets, nextEdge.source);
            int y = find(subsets, nextEdge.target);
      
            if(x != y){
                mst.add(nextEdge);
                union(subsets, x, y);
            }
        }

        System.out.println(mst);
    }

    static int find(int[] subsets, int i){
        System.out.println(i);
        if(subsets[i] == -1)
            return i;
        return find(subsets, subsets[i]);
    }

    static void union(int[]subsets, int x, int y){
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);
        subsets[rootX] = rootY;
    }

    static class Edge implements Comparable<Edge>{
        int source;
        int target;
        int weight;
        public Edge(int s, int t, int w){
            source = s;
            target = t;
            weight = w;
        }
        @Override public int compareTo(Edge other) {
        return weight - other.weight;
        }
        public String toString(){
            return source + " -> " + target + ", " + weight;
        }
    }
}
