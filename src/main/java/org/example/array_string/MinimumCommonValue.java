package org.example.array_string;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        int j = 0;
        for (int k : nums1) {
            while (j < nums2.length && k > nums2[j]) {
                j++;
            }
            if (j == nums2.length) {
                j--;
            }
            if (k == nums2[j]) {
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,5,7};
        int[] nums2 = {2, 5};
        System.out.println(getCommon(nums1, nums2));

    }
}
