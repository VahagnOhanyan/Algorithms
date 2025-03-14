package org.example.array_string;

import java.util.Arrays;

public class MoveZeros {
    public static int[] moveZeroes(int[] nums) {
        int length = nums.length - 1;
        for (int i = 0; i < length; i++) {
            int j = 1;
            if (nums[i] == 0) {
                while (i + j <= length && nums[i] == nums[i + j]) {
                    j++;
                }

                if (i + j <= length) {
                    int temp = nums[i];
                    nums[i] = nums[i + j];
                    nums[i + j] = temp;
                }
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 0, 5, 12, 0};
        System.out.println(Arrays.toString(moveZeroes(nums)));

    }
}
