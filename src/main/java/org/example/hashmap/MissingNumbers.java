package org.example.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumbers {
    public static int missingNumbers(int[] nums) {
        Arrays.sort(nums);
        int missing = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1,8};
        System.out.println(missingNumbers(nums));

    }
}
