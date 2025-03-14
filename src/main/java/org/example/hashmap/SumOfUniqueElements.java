package org.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                if (map.get(num) == 1) {
                    sum -= num;
                    map.put(num, 2);
                }
                continue;
            }
            sum += num;
            map.put(num, 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));

    }
}
