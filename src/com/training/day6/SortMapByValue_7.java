package com.training.day6;

import java.util.*;

public class SortMapByValue_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
            sc.nextLine(); 
            map.put(name, salary);
        }

        // Convert map to list for sorting
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort list by salary
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue()); // ascending order
            }
        });

        System.out.println("\nSorted by salary (ascending):");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        sc.close();
    }
}
