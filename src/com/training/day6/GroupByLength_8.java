package com.training.day6;

import java.util.*;

public class GroupByLength_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = new ArrayList<>();
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words.add(sc.nextLine());
        }

        // Grouping by word length using if-else
        Map<Integer, List<String>> grouped = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            if (!grouped.containsKey(length)) {
                grouped.put(length, new ArrayList<>());
            }
            grouped.get(length).add(word);
        }

        // Displaying grouped result
        for (Map.Entry<Integer, List<String>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}

