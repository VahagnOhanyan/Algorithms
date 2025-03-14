package org.example.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIfPathExistsInGraph {
    Map<Integer, List<Integer>> map = new HashMap<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0) {
            return true;
        }
        boolean[] visited = new boolean[n];
        visited[source] = true;
        visited[destination] = true;
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);

        }
        return dfs(visited, source, destination);

    }

    private boolean dfs(boolean[] visited, int source, int destination) {
        for (Integer neighbour : map.get(source)) {
            if (neighbour == destination) {
                return true;
            }
            if (!visited[neighbour]) {
                visited[neighbour] = true;
                boolean dfs = dfs(visited, neighbour, destination);
                if (dfs) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] edges = {
                {0, 7}, {0, 8}, {6, 1}, {2, 0}, {0, 4},
                {5, 8}, {4, 7}, {1, 3}, {3, 5}, {6, 5}
        };
        FindIfPathExistsInGraph findIfPathExistsInGraph = new FindIfPathExistsInGraph();
        System.out.println(findIfPathExistsInGraph.validPath(10, edges, 7, 5));
    }
}
