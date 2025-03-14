package org.example.graph;

import java.util.*;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {

        ArrayList<Integer> visited = new ArrayList<>();
        int componentCount = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited.contains(i)) {
                ++componentCount;
                visited.add(i);
                dfs(i, isConnected, visited);
            }

        }


        return componentCount;
    }

    private void dfs(int node, int[][] isConnected, ArrayList<Integer> visited) {

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[node][j] == 1 && !visited.contains(j)) {
                visited.add(j);
                dfs(j, isConnected, visited);
            }
        }
    }


    public static void main(String[] args) {
        int[][] cities = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces();
        System.out.println(numberOfProvinces.findCircleNum(cities));

    }


}

