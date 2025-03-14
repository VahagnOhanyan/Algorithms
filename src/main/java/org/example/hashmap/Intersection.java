package org.example.hashmap;

import java.util.*;

public class Intersection {
    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                if (map.get(i) == nums.length) {
                    list.add(i);
                }


            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[][] nums = {{3, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        System.out.println(intersection(nums));

    }
}
