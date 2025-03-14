package org.example.graph;

import java.util.*;

public class KeysAndRooms {
    Set<Integer> allKeys = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Integer> initKeys;
        if (!rooms.isEmpty()) {
            initKeys = rooms.get(0);
            bfs(rooms, initKeys);
        }
        allKeys.remove(0);
        System.out.println(allKeys);
        return rooms.size() - 1 == allKeys.size();
    }

    private void bfs(List<List<Integer>> rooms, List<Integer> keys) {
        for (Integer key : keys) {
            if (!allKeys.contains(key) && key < rooms.size() + 1) {
                List<Integer> nextKeys = rooms.get(key);
                allKeys.add(key);
                bfs(rooms, nextKeys);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList()
        ));
        int n = 5;
        KeysAndRooms keysAndRooms = new KeysAndRooms();
        System.out.println(keysAndRooms.canVisitAllRooms(rooms));
    }

}
