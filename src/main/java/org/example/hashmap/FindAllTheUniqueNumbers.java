package org.example.hashmap;

import java.util.*;

public class FindAllTheUniqueNumbers {
    public static List<Integer> findAllTheUniqueNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] + 1) && !set.contains(nums[i] - 1)) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 10, 5, 5, 7, 4, 9, 8, 5, 6, 10, 6};
        System.out.println(findAllTheUniqueNums(nums));

    }
}
