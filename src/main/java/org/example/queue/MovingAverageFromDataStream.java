package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverageFromDataStream {
    static int size;
    static Queue<Integer> queue;
    static int sum = 0;

    public MovingAverageFromDataStream(int size) {
        this.size = size;
        queue = new LinkedList<>();
    }

    public static double next(int val) {
        queue.offer(val);
        while (queue.size() > size) {
            sum -= queue.poll();
        }

        sum += val;
        return (double) sum / queue.size();
    }

    public static void main(String[] args) {
        MovingAverageFromDataStream obj = new MovingAverageFromDataStream(3);
      //  double param_1 = obj.next(3);
        double param_2 = obj.next(1);
        double param_3 = obj.next(10);
        double param_4 = obj.next(3);
        double param_5 = obj.next(5);
        System.out.println(param_2 + " " + param_3 + " " + param_4 + " " + param_5);
    }
}
