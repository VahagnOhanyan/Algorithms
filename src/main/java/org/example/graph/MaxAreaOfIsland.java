package org.example.graph;

public class MaxAreaOfIsland {
    int max = 0;

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, dfs(grid, i, j, visited));

            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i > grid.length - 1 || j > grid[0].length || j < 0) {
            return 0;
        }
        if (grid[i][j] == 1 && !visited[i][j]) {
            visited[i][j] = true;
            return 1 + dfs(grid, i + 1, j, visited) +
                    dfs(grid, i, j + 1, visited) +
                    dfs(grid, i - 1, j, visited) +
                    dfs(grid, i, j - 1, visited);
        }
        return 0;

    }


    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        MaxAreaOfIsland m = new MaxAreaOfIsland();
        System.out.println(m.maxAreaOfIsland(grid));
    }
}
