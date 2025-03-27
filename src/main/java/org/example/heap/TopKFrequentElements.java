package org.example.heap;

import javax.swing.*;
import java.util.*;

class Pair implements Comparable<Pair> {
    Integer i;
    int frequency = 0;

    public Pair(int i, int frequency) {
        this.i = i;
        this.frequency = frequency;
    }


    @Override
    public int compareTo(Pair o) {
        return i.compareTo(o.i);
    }
}

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
                Comparator.comparingInt(count::get));

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }

        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }

        return top;
    }


    public static void main(String[] args) {
        var t = new TopKFrequentElements();
        int[] nums = {1, 6, 1, 2, 6, 6};
        int k = 2;
        System.out.println(Arrays.toString(t.topKFrequent(nums, k)));
    }
}
