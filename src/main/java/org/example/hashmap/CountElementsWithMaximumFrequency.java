package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public static int maxFrequencyElements(int[] nums) {
        int frequency = 1;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > frequency) {
                sum = frequency = map.get(num);
            }else if (map.get(num) == frequency) {
                sum += frequency;
            }


        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 3};
        System.out.println(maxFrequencyElements(nums));
    }
}
