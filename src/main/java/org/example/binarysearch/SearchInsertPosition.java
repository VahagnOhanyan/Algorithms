package org.example.binarysearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }


        }
        return left;
    }

    public static void main(String[] args) {
        var s = new SearchInsertPosition();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int target = 8;
        System.out.println(s.searchInsert(nums, target));
    }
}
