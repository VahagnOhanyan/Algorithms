package org.example.hashmap;

import java.util.*;

public class LargestUniqueNumber {

    public static int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        Arrays.sort(nums);
        for (int i = nums.length-1; i >= 0; i--)
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9,9,8,8,7};
        System.out.println(largestUniqueNumber(nums));

    }
}
