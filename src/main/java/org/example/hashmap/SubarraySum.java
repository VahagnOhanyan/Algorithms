package org.example.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int count = 0;
        int sum = 0;
        counts.put(0, 1);
        for (int num : nums) {
            sum += num;
            count += counts.getOrDefault(sum - k, 0);
            counts.put(sum, counts.getOrDefault(sum, 0) + 1);

        }
       return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1};
        int k = 3;
        System.out.println(subarraySum(nums, k));

    }
}
