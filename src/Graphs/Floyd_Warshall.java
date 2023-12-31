package Graphs;
import java.util.*;

public class Floyd_Warshall {
    static void floydWarshall(int[][] mat, int V){

        final int INF = 99999;

        int[][] distances = mat;
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if(distances[i][k] + distances[k][j] < distances[i][j])
                        distances[i][j] = distances[i][k] + distances[k][j];
                }
            }  
        }
        _Graphs.printMatrix(distances);
    }
}
