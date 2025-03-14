package org.example.daily_challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindChampionII {
    public static int findChampion(int n, int[][] edges) {
        int m = edges.length;
        if (m > n * (n - 1) / 2) return -1;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            for (int j = 0; j < edge.length; j++) {
                if (!map.containsKey(j)) {
                    map.put(j, new ArrayList<>());
                }
                map.get(j).add(edge[j]);
            }
        }
        if (map.isEmpty()) return -1;
        map.get(0).removeAll(map.get(1));
        return map.get(0).size() > 1 ? -1 : map.get(0).get(0);
    }

    public static void main(String[] args) {
        int n = 1;
        int[][] edges = {};
        System.out.println(findChampion(n, edges));
    }
}
