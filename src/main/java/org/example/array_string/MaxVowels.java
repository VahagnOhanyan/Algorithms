package org.example.array_string;

public class MaxVowels {
    public static int maxVowels(String s, int k) {
        int sum = 0;
        int left = 0;
        int max = 0;
        for (int right = 0; right <s.length(); right++) {
            sum+= isVowel(s.charAt(right)) ? 1 : 0;
            if(right - left + 1 == k) {
                max = Math.max(max, sum);
                sum-=isVowel(s.charAt(left++)) ? 1 : 0;
            }
        }
        return max;
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Make it case-insensitive
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 4;
        System.out.println(maxVowels(s, k));

    }
}
