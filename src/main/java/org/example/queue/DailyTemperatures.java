package org.example.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int right = 1;
            while (right + i < n && temperatures[i] >= temperatures[i + right]) {
                right++;
            }
            if (right + i < n) {
                array[i] = right;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] temperatures = {76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
