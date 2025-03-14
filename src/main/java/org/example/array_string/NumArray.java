package org.example.array_string;

class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;

    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(0, 2);
        int param_2 = obj.sumRange(3, 5);
        int param_3 = obj.sumRange(1, 4);
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);

    }
}
