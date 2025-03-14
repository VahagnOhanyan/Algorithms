package org.example.array_string;

public class EqualSubstring {
    public static int equalSubstring(String s, String t, int maxCost) {
        int sum = 0;
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            sum+= Math.abs(s.charAt(right) - t.charAt(right));
            while (sum > maxCost) {
                sum-=Math.abs(s.charAt(left) - t.charAt(left));
                left++;

            }
            max =Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "krpgjbjjznpzdfy";
        String t = "nxargkbydxmsgby";
        int maxCost = 14;
        System.out.println(equalSubstring(s, t, maxCost));

    }
}
