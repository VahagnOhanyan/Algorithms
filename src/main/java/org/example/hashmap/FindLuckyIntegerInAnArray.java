package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindLuckyIntegerInAnArray {
    public static int findLucky(int[] arr) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue())) {
                max = Math.max(entry.getKey(), max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
        System.out.println(findLucky(nums));
    }
}
