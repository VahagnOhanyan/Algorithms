package org.example.array_string;

public class LargestAltitude {
    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = -100;
        for (int j : gain) {
            sum += j;
            max = Math.max(max, sum);
        }
        return Math.max(max, 0);
    }

    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));

    }
}
