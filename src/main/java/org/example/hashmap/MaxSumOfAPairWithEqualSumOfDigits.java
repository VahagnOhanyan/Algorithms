package org.example.hashmap;

import java.util.*;


public class MaxSumOfAPairWithEqualSumOfDigits {

    public static int maximumSum(int[] nums) {
        int sum;
        int max = -1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            String number = String.valueOf(num);
            sum = 0;
            for (int j = number.length() - 1; j >= 0; j--) {
                sum += number.charAt(j) - '0';
            }

            if (!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }
            map.get(sum).add(num);
            if (map.get(sum).size() > 1) {
                map.get(sum).sort(Collections.reverseOrder());
                max = Math.max(max, map.get(sum).get(0) + map.get(sum).get(1));
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {229, 398, 269, 317, 420, 464, 491, 218, 439, 153, 482, 169, 411, 93, 147, 50, 347, 210, 251, 366, 401};
        System.out.println(maximumSum(nums));

    }
}
