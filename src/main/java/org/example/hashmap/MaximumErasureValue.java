package org.example.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        int left = 0;
        int max = 0;
        int sum = 0;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            prefix[i + 1] = prefix[i] + nums[i + 1];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                left = Math.max(left, map.get(nums[i]));
                sum = prefix[i - 1] - prefix[left];
            }
            map.put(nums[i], i);
            sum += nums[i];
            max = Math.max(max, sum);


        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4, 5, 6};
        System.out.println(maximumUniqueSubarray(nums));

    }
}
