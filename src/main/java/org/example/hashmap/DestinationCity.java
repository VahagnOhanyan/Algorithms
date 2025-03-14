package org.example.hashmap;

import java.util.*;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> dest = new HashSet<>();
        Set<String> outgoing = new HashSet<>();
        for (List<String> path : paths) {
            outgoing.add(path.get(0));
            dest.add(path.get(1));

        }
        dest.removeAll(outgoing);
        return dest.toArray()[0].toString();
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));
        System.out.println(destCity(paths));

    }
}
