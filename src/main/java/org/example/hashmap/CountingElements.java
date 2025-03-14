package org.example.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public static int countElements(int[] arr) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int k : arr) {
            set.add(k);
        }
        for (int j : arr) {
            if (set.contains(j + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        System.out.println(countElements(nums));

    }
}
