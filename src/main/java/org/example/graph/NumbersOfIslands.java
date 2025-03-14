package org.example.graph;

public class NumbersOfIslands {
    int count = 0;
    boolean[][] seen;

    public int numIslands(char[][] grid) {
        seen = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count += bfs(grid, i, j);
            }
        }
        return count;
    }

    private int bfs(char[][] grid, int i, int j) {
        if (grid[i][j] == '0' || seen[i][j]) {
            return 0;
        }
        if (grid[i][j] == '1' && !seen[i][j]) {
            seen[i][j] = true;
            if (i + 1 < grid.length) {
                bfs(grid, i + 1, j);
            }
            if (j + 1 < grid[0].length) {
                bfs(grid, i, j + 1);
            }
            if (j - 1 >= 0) {
                bfs(grid, i, j - 1);
            }
            if (i - 1 >= 0) {
                bfs(grid, i - 1, j);
            }

            return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        char[][] grid = {
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}};
        NumbersOfIslands numbersOfIslands = new NumbersOfIslands();
        System.out.println(numbersOfIslands.numIslands(grid));
    }
}
