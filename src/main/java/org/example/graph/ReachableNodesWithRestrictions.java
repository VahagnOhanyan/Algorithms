package org.example.graph;

import java.util.*;

public class ReachableNodesWithRestrictions {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean[] visited = new boolean[n];
        for (int i : restricted) {
            set.add(i);
        }

        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        System.out.println(map);
        return dfs(0, restricted, visited);
    }

    private int dfs(int i, int[] restricted, boolean[] visited) {
        if (!set.contains(i) && !visited[i]) {
            visited[i] = true;
            int c = 0;
            for (Integer neighbour : map.get(i)) {
                c += dfs(neighbour, restricted, visited);
            }
            return 1 + c;
        }

        return 0;
    }

    public static void main(String[] args) {
        int n = 7;

        int[][] edges = {
                {0, 1},
                {1, 2},
                {3, 1},
                {4, 0},
                {0, 5},
                {5, 6}
        };

        int[] restricted = {4, 5};

        ReachableNodesWithRestrictions nodes = new ReachableNodesWithRestrictions();
        System.out.println(nodes.reachableNodes(n, edges, restricted));
    }
}
