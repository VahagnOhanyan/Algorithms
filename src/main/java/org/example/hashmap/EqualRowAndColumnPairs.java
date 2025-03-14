package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();
        int count = 0;
        Map<String, Integer> column = new HashMap<>();
        Map<String, Integer> row = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                key.append(grid[j][i]).append(",");
                value.append(grid[i][j]).append(",");
            }
            column.put(key.toString(), column.getOrDefault(key.toString(), 0) + 1);
            row.put(value.toString(), row.getOrDefault(value.toString(), 0) + 1);
            key.setLength(0);
            value.setLength(0);
        }
        for (Map.Entry<String, Integer> entry : row.entrySet()) {
            if (column.containsKey(entry.getKey())) {
                count += column.get(entry.getKey()) * entry.getValue();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] nums = {{11, 1}, {1, 11}};
        System.out.println(equalPairs(nums));

    }
}
