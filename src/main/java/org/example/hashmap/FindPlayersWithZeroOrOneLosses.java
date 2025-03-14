package org.example.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class FindPlayersWithZeroOrOneLosses {

    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Map<Integer, Integer> losers = new HashMap<>();
        List<List<Integer>> answers = new ArrayList<>();
        for (int[] match : matches) {
            winners.add(match[0]);
            losers.put(match[1], losers.getOrDefault(match[1], 0) + 1);

        }
        winners.removeAll(losers.keySet());
        answers.add(new ArrayList<>(winners));
        List<Integer> losserList = new ArrayList<>();
        answers.add(losserList);
        for (Map.Entry<Integer, Integer> entry : losers.entrySet()) {
            if (entry.getValue() == 1) {
                losserList.add(entry.getKey());
            }
        }
        Collections.sort(answers.get(0));
        Collections.sort(answers.get(1));
        return answers;
    }

    public static void main(String[] args) {
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        System.out.println(findWinners(matches));

    }
}
