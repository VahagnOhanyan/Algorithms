package org.example.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestSubarrayWithAtMostKFrequency {

    public static int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            if (!map.containsKey(nums[right])) {
                map.put(nums[right], new ArrayList<>());
            }
            map.get(nums[right]).add(right);
            int size = map.get(nums[right]).size();
            if (size > k) {
                left = Math.max(left, map.get(nums[right]).get(size - k - 1) + 1);
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,1,3};
        int k = 1;
        System.out.println(maxSubarrayLength(nums, k));
    }
}
