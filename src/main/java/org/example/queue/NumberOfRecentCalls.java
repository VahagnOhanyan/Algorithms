package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    static Queue<Integer> queue;

    public NumberOfRecentCalls() {
        queue = new LinkedList<>();

    }

    public static int ping(int t) {
        queue.offer(t);

        while(t - 3000 > queue.peek()) {
               queue.poll();
            }
        return queue.size();


    }

    public static void main(String[] args) {
        NumberOfRecentCalls obj = new NumberOfRecentCalls();
        int param_1 = obj.ping(1);
        System.out.println(param_1);
        int param_2 = obj.ping(100);
        System.out.println(param_2);
        int param_3 = obj.ping(3001);
        System.out.println(param_3);
        int param_4 = obj.ping(3002);
        System.out.println(param_4);
    }
}
