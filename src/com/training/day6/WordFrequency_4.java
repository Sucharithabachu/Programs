package com.training.day6;

import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        sentence = sentence.replace(".", "").replace(",", "").toLowerCase();
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // If word is already in map, increase count
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                // If not, add word with count 1
                wordCount.put(word, 1);
            }
        }

        System.out.println("Word frequencies:");
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }

        sc.close();
    }
}
