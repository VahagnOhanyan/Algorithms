package org.example.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            priorityQueue.add(stone);
        }
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty() && priorityQueue.size() != 1) {
            int stone = priorityQueue.remove();
            int stone2 = priorityQueue.remove();
            if (stone != stone2) {
                priorityQueue.add(stone - stone2);
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.peek();
    }


    public static void main(String[] args) {
        var l = new LastStoneWeight();
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(l.lastStoneWeight(stones));
    }
}
