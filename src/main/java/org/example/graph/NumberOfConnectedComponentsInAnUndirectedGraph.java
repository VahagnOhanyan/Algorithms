package org.example.graph;

import java.util.*;

public class NumberOfConnectedComponentsInAnUndirectedGraph {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Queue<Integer> queue = new LinkedList<>();
    int count = 0;

    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);

        }
        System.out.println(map);
        List<Integer> neighbours = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                queue.offer(i);
                while (!queue.isEmpty()) {
                    if (!visited[queue.peek()]) {
                        visited[queue.peek()] = true;
                        if (map.containsKey(queue.peek())) {
                            neighbours = map.get(queue.poll());
                        }
                        for (Integer neighbour : neighbours) {
                            queue.offer(neighbour);
                        }
                    } else {
                        queue.poll();
                    }

                }
                if (queue.isEmpty()) {
                    ++count;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfConnectedComponentsInAnUndirectedGraph connectedComponents = new NumberOfConnectedComponentsInAnUndirectedGraph();
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        int n = 5;
        System.out.println(connectedComponents.countComponents(n, edges));
    }
}
