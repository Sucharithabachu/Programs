package com.training.day6;

import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency_5 {
    public static void main(String[] args) {
        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String input = sc.nextLine();
        input = input.toLowerCase();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (charCount.containsKey(ch)) {
                int count = charCount.get(ch);
                charCount.put(ch, count + 1);
            } else {
                charCount.put(ch, 1);
            }
        }

        System.out.println("Character frequencies:");
        for (char ch : charCount.keySet()) {
            int count = charCount.get(ch);
            System.out.println(ch + ": " + count);
        }

        sc.close();
    }
}
