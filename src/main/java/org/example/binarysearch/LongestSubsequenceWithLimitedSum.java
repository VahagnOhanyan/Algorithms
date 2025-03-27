package org.example.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestSubsequenceWithLimitedSum {

    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int count = 0;
            for (int e : nums) {
                sum += e;
                if (sum <= queries[i]) {
                    count++;
                }

            }
            answer[i] = count;

        }
        return answer;
    }

    public static void main(String[] args) {
        var l = new LongestSubsequenceWithLimitedSum();
        int[] nums = {4, 5, 2, 1};// 1245
        int[] queries = {3, 10, 21};
        System.out.println(Arrays.toString(l.answerQueries(nums, queries)));
    }
}
