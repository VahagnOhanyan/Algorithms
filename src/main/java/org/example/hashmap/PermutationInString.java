package org.example.hashmap;

import java.util.*;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        int target = 0;
        int sum = 0;
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        int windowSize = s1.length();
        for (int i = 0; i < sortedString.length(); i++) {
            target += s1.charAt(i);
        }
        int left = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sbSorted = new StringBuilder();
        for (int right = 0; right < s2.length(); right++) {
            sum += s2.charAt(right);
            sb.append(s2.charAt(right));
            if (right - left + 1 == windowSize) {
                if (sum == target) {
                    chars = sb.toString().toCharArray();
                    Arrays.sort(chars);
                    sbSorted.setLength(0);
                    sbSorted.append(chars);
                    if (sortedString.contentEquals(sbSorted)) {
                        return true;
                    }
                }
                sb.deleteCharAt(0);
                sum -= s2.charAt(left++);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s2 = "dinitrophenylhydrazinetrinitrophenylmethylnitramine";
        String s1 = "trinitrophenylmethylnitramine";
        System.out.println(checkInclusion(s1, s2));
    }
}
