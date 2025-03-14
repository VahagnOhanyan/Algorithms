package org.example.hashmap;

import java.util.*;

public class PathCrossing {
    public static boolean isPathCrossing(String path) {
        Map<String, Integer> map = new HashMap<>();
        map.put("0,0", 1);
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'N') {
                y++;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            }
            map.put(x + "," + y, map.getOrDefault(x + "," + y, 0) + 1);
            if (map.get(x + "," + y) > 1) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String path = "ENNNNNNNNNNNEEEEEEEEEESSSSSSSSSS";
        System.out.println(isPathCrossing(path));

    }
}
