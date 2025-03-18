package org.example.graph;

import java.util.*;

public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        int[][] direction = new int[][]{
                {1, 0, 0, 0}, {0, 1, 0, 0},
                {0, 0, 1, 0}, {0, 0, 0, 1},
                {-1, 0, 0, 0}, {0, -1, 0, 0},
                {0, 0, -1, 0}, {0, 0, 0, -1}};

        Set<String> visited = new HashSet<>(Arrays.asList(deadends));
        Queue<String> queue = new LinkedList<>();
        if (start.equals(target)) {
            return 0;
        }
        if (!visited.contains(start)) {
            visited.add(start);
            queue.add("0000");
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String[] code = queue.poll().split("(?<=\\G.)");
                int first = Integer.parseInt(code[0]);
                int second = Integer.parseInt(code[1]);
                int third = Integer.parseInt(code[2]);
                int forth = Integer.parseInt(code[3]);
                for (int[] dir : direction) {
                    int firstNext = first + dir[0];
                    firstNext = changeValue(firstNext);
                    int secondNext = second + dir[1];
                    secondNext = changeValue(secondNext);
                    int thirdNext = third + dir[2];
                    thirdNext = changeValue(thirdNext);
                    int forthNext = forth + dir[3];
                    forthNext = changeValue(forthNext);
                    String next = String.valueOf(firstNext) + secondNext + thirdNext + forthNext;
                    if (next.equals(target)) {
                        return count + 1;
                    }
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.add(next);
                    }
                }
            }
            count++;
        }
        return -1;
    }

    private int changeValue(int value) {
        value = value < 0 ? 10 + value : value;
        value = value > 9 ? 10 - value : value;
        return value;
    }

    public static void main(String[] args) {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";
        var o = new OpenTheLock();
        System.out.println(o.openLock(deadends, target));

    }
}
