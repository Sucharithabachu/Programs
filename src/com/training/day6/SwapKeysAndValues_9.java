package com.training.day6;

import java.util.*;

public class SwapKeysAndValues_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            String value = sc.nextLine();
            map.put(key, value);
        }

        Map<String, String> swapped = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            swapped.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Swapped Map: " + swapped);
        sc.close();
    }
}
