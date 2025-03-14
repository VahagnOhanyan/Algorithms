package org.example.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Cell {
    int row;
    int col;
    int val;

    Cell(int row, int col, int val) {
        this.row = row;
        this.col = col;
        this.val = val;
    }
}

public class Matrix {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Cell> queue = new LinkedList<>();

        int[][] matUpdated = new int[mat.length][mat[0].length];
        boolean[][] visited;
        for (int m = 0; m < mat.length; m++) {
            for (int n = 0; n < mat[0].length; n++) {
                queue.clear();
                queue.add(new Cell(m, n, mat[m][n]));
                int count = 0;
                visited = new boolean[mat.length][mat[0].length];
                visited[m][n] = true;
                out:
                while (!queue.isEmpty()) {
                    int size = queue.size();
                    for (int k = 0; k < size; k++) {
                        Cell v = queue.poll();
                        if (v != null) {
                            int i = v.row;
                            int j = v.col;
                            if (v.val == 0) {
                                matUpdated[m][n] = count;
                                break out;
                            }
                            if (i + 1 < mat.length && !visited[i + 1][j]) {
                                queue.add(new Cell(i + 1, j, mat[i + 1][j]));
                                visited[i + 1][j] = true;

                            }
                            if (i - 1 >= 0 && !visited[i - 1][j]) {
                                queue.add(new Cell(i - 1, j, mat[i - 1][j]));
                                visited[i - 1][j] = true;
                            }
                            if (j + 1 < mat[0].length && !visited[i][j + 1]) {
                                queue.add(new Cell(i, j + 1, mat[i][j + 1]));
                                visited[i][j + 1] = true;
                            }
                            if (j - 1 >= 0 && !visited[i][j - 1]) {
                                queue.add(new Cell(i, j - 1, mat[i][j - 1]));
                                visited[i][j - 1] = true;
                            }
                        }
                    }
                    ++count;

                }
            }
        }
        return matUpdated;

    }


    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1},
                {1, 0, 0},
                {1, 1, 1}
        };
        Matrix matrix = new Matrix();
        int[][] arr = matrix.updateMatrix(mat);
        System.out.println(Arrays.deepToString(arr));
    }
}
