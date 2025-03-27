package org.example.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumOperationsToHalveArraySum {


    public int halveArray(int[] nums) {
        double sum = 0;
        double reducedSum = 0;
        int count = 0;
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (double num : nums) {
            sum += num;
            priorityQueue.add(num);
        }
        System.out.println(priorityQueue);
        while (sum / 2 < sum - reducedSum) {
            double biggest = priorityQueue.remove();
            reducedSum += biggest / 2;
            priorityQueue.add(biggest / 2);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        var m = new MinimumOperationsToHalveArraySum();
        int[] nums = {6,58,10,84,35,8,22,64,1,78,86,71,77};
        System.out.println(m.halveArray(nums));
    }
}
