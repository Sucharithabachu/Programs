package com.training.day6;

import java.util.*;

public class ListElementFrequencies_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> freq = new HashMap<>();
        for (String item : list) {
            freq.put(item, freq.getOrDefault(item, 0) + 1);
        }

        System.out.println("Frequencies: " + freq);
        sc.close();
    }
}
