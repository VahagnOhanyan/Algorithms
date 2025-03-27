package org.example.daily_challenge;

import java.util.*;

public class MinimumIndexOfAValidSplit {

    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int dominant = 0;
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.size() / 2) {
                dominant = num;
                count = map.get(num);
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == dominant) {
                map.put(nums.get(i), map.get(nums.get(i)) - 1);
                if (map.get(nums.get(i)) > (nums.size() - (i + 1)) / 2 && count - map.get(nums.get(i)) > (i + 1) / 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        var m = new MinimumIndexOfAValidSplit();
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 1, 2));
        System.out.println(m.minimumIndex(nums));
    }
}