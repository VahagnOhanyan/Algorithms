package org.example.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
          for (int i = 0; i < nums.length - 1; i++) {
                  int r = target - nums[i];
                  if(map.containsKey(r)){
                      return new int[]{i, map.get(r)};
                  };
                  map.putIfAbsent(nums[i], i);
          }
          return null;
    }

    public static void main(String[] args) {
        int[] nums= {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }
}
