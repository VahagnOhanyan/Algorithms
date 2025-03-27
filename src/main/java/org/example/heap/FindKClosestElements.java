package org.example.heap;

import java.util.*;
import java.util.stream.Collectors;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> {
                    int diffA = Math.abs(a - x);
                    int diffB = Math.abs(b - x);
                    if (diffA == diffB) {
                        return a - b;  // If distances are equal, smaller number comes first
                    }
                    return diffA - diffB;  // Otherwise, closer number comes first
                }
        );

        // Add all elements to the priority queue
        for (int num : arr) {
            pq.offer(num);
        }

        // Create result list and add k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !pq.isEmpty(); i++) {
            result.add(pq.poll());
        }

        // Sort the result in ascending order
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        int k = 1;
        int x = 1;
        var f = new FindKClosestElements();
        System.out.println(f.findClosestElements(arr, k, x));
    }
}
