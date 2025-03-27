package org.example.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {

    public int minStoneSum(int[] piles, int k) {
        int sum = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int pile : piles) {
            sum += pile;
            priorityQueue.add(pile);
        }
        int count = 0;
        while (k > count) {
            int p = priorityQueue.remove();
            int d = p / 2;
            sum = sum - d;
            priorityQueue.add(p - d);
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        var r = new RemoveStonesToMinimizeTheTotal();
        int[] piles = {5, 4, 9};
        int k = 2;
        System.out.println(r.minStoneSum(piles, k));
    }
}
