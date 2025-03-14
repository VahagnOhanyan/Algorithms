package org.example.graph;

import java.util.*;

public class SnakesAndLadders {
    Queue<Integer> queue = new LinkedList<>();
    int min = Integer.MAX_VALUE;

    public int snakesAndLadders(int[][] board) {
        return 0;
    }

    public static void main(String[] args) {
        int[][] board = {
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        SnakesAndLadders snakesAndLadders = new SnakesAndLadders();
        System.out.println(snakesAndLadders.snakesAndLadders(board));

    }
}
