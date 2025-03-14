package org.example.array_string;

public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int min = nums.length+1;
        for (int right = 0; right <nums.length; right++) {
            sum+= nums[right];
            while (sum >= target) {
                min = Math.min(min, right-left + 1);
                sum -= nums[left++];
            }
        }
        return min == nums.length+1 ? 0 : min;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 2, 4, 1};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));

    }


}
