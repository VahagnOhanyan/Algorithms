package org.example.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class NearestExitFromEntranceInMaze {
    class Cell {
        int c;
        int row;
        int col;

        public Cell(int c, int row, int col) {
            this.c = c;
            this.row = row;
            this.col = col;
        }
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        int row = entrance[0];
        int col = entrance[1];
       /* boolean[][] seen = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maze[i][j] == '+') {
                    seen[i][j] = true;
                }
            }
        }*/
       // System.out.println(Arrays.deepToString(seen));
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        Queue<Cell> queue = new LinkedList<>();
        queue.add(new Cell(0, row, col));
        maze[row][col] = '+';
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            for (int[] direction : directions) {
                int dir0 = direction[0];
                int dir1 = direction[1];
                if (isValid(cell.row + dir0, cell.col + dir1, m, n)) {
                    if (maze[cell.row + dir0][cell.col + dir1] == '.') {
                        queue.add(new Cell(cell.c + 1, cell.row + dir0, cell.col + dir1));
                        maze[cell.row + dir0][cell.col + dir1] = '+';
                    }
                } else {
                    if (cell.c != 0) {
                        return cell.c;
                    }
                }


            }
        }

        return -1;
    }

    private boolean isValid(int row, int col, int m, int n) {
        return row >= 0 && row < m && col >= 0 && col < n;
    }

    public static void main(String[] args) {
        char[][] maze = {
                {'+', '.', '+', '+', '+', '+', '+'},
                {'+', '.', '+', '.', '.', '.', '+'},
                {'+', '.', '+', '.', '+', '.', '+'},
                {'+', '.', '.', '.', '+', '.', '+'},
                {'+', '+', '+', '+', '+', '.', '+'}
        };
        int[] entrance = {0, 1};
        NearestExitFromEntranceInMaze nearestExitFromEntranceInMaze = new NearestExitFromEntranceInMaze();
        System.out.println(nearestExitFromEntranceInMaze.nearestExit(maze, entrance));
    }
}
