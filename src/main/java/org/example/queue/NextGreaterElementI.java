package org.example.queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        /*int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            result[i] = -1;
            for (int k : nums2) {
                if (found) {
                    if (nums1[i] < k) {
                        result[i] = k;
                        break;
                    }
                }
                if (nums1[i] == k) {
                    found = true;
                }
            }

        }
        return result;*/

        /*HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = -1;
            int key = nums1[i];
            int index = map.get(key);
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > key) {
                    res[i] = nums2[j];
                    break;
                }
            }
        }
        return res;*/
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int k : nums2) {
            while (!stack.isEmpty() && stack.peek() < k) {
                map.put(stack.pop(), k);
            }
            stack.push(k);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for (int j = 0; j < nums1.length; j++) {
            res[j] = map.get(nums1[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
