package org.example.array_string;

import java.util.Arrays;

public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
       /* int left = 0;
        int sumRight = 0;
        int sumLeft = 0;

        for (int right = nums.length - 1; right >= 0; right--) {
            sumRight += nums[right];
            sumLeft += nums[left];
            while (sumLeft < sumRight) {
                sumLeft += nums[++left];
            }
            while (sumLeft > sumRight) {
                sumRight += nums[++right];
            }
            if (sumLeft == sumRight && right - left == 1) {
                return right-1;
            }
        }
        return -1;*/
        int[] prefixSum = new int[nums.length + 2];
        int[] prefixSumReversed = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
            prefixSumReversed[nums.length  - i] = prefixSumReversed[nums.length - i + 1] + nums[nums.length - 1 - i];
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(prefixSumReversed));
        for (int i = 0; i < prefixSum.length; i++) {
            for (int j = 0; j < prefixSumReversed.length; j++) {
                if (prefixSum[i] == prefixSumReversed[j]) {
                    /*if (i - j == 2) {
                        return i + 2;
                    }*/
                    if (j - i == 2) {
                        return j-2;
                    }

                }
            }

        }
        return -1;
    }


    public static void main(String[] args) {
                    /*  1 8 11 17 22 28
                      28 27 20 17 11 6*/
        int[] nums = {1,2,3};
        System.out.println(pivotIndex(nums));

    }
}
