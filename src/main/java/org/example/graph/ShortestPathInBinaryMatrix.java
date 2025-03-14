package org.example.graph;

import javax.swing.*;
import java.util.*;

public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("0;0");
        int shortestPathLength = 0;
        while (!queue.isEmpty()) {
            int count = queue.size();
            ++shortestPathLength;
            for (int m = count; m > 0; m--) {
                String key = queue.poll();
                if (key != null) {
                    String[] arr = key.split(";");
                    int i = Integer.parseInt(arr[0]);
                    int j = Integer.parseInt(arr[1]);
                    if (i == grid.length - 1 && j == grid[0].length - 1) {
                        return shortestPathLength;
                    }
                    if (i + 1 <= grid.length - 1 && j + 1 <= grid[0].length - 1 && grid[i + 1][j + 1] == 0) {
                        queue.add((i + 1) + ";" + (j + 1));
                    }
                    if (i + 1 <= grid.length - 1 && j - 1 >= 0 && grid[i + 1][j - 1] == 0) {
                        queue.add((i + 1) + ";" + (j - 1));
                    }
                    if (i + 1 <= grid.length - 1 && grid[i + 1][j] == 0) {

                        queue.add((i + 1) + ";" + j);
                    }
                    if (j + 1 <= grid[0].length - 1 && grid[i][j + 1] == 0) {

                        queue.add(i + ";" + (j + 1));
                    }
                    if (i - 1 >= 0 && j - 1 >= 0 && grid[i - 1][j - 1] == 0) {
                        queue.add((i - 1) + ";" + (j - 1));
                    }
                    if (i - 1 >= 0 && j + 1 <= grid[0].length - 1 && grid[i - 1][j + 1] == 0) {
                        queue.add((i - 1) + ";" + (j + 1));
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 0) {
                        queue.add(i + ";" + (j - 1));
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 0) {
                        queue.add((i - 1) + ";" + j);
                    }
                }
            }

        }
        return -1;
    }


    public static void main(String[] args) {
       /* int[][] grid = {
                {0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 0},
                {1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0}
        };*/

        int[][] grid = {
                {0, 0, 0},
                {1, 0, 0},
                {1, 1, 0}
        };
       /* int[][] grid =
                {
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0},
                        {0, 1, 0, 1, 0},
                        {0, 0, 0, 1, 1},
                        {0, 0, 0, 1, 0}
                };*/
        ShortestPathInBinaryMatrix shortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();
        System.out.println(shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));

    }
}
