package org.example.graph;

import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, List<Integer>> mapTo = new HashMap<>();

        for (List<Integer> edge : edges) {
            map.computeIfAbsent(edge.get(0), k -> new ArrayList<>()).add(edge.get(1));
            mapTo.computeIfAbsent(edge.get(1), k -> new ArrayList<>()).add(edge.get(0));

        }
        map.keySet().removeAll(mapTo.keySet());
        return new ArrayList<>(map.keySet());
    }


    public static void main(String[] args) {
        List<List<Integer>> edges = new ArrayList<>(Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(0, 2),
                Arrays.asList(2, 5),
                Arrays.asList(3, 4),
                Arrays.asList(4, 2)
        ));
        int n = 6;
        MinimumNumberOfVerticesToReachAllNodes verticesToReachAllNodes = new MinimumNumberOfVerticesToReachAllNodes();
        System.out.println(verticesToReachAllNodes.findSmallestSetOfVertices(n, edges));
    }
}
