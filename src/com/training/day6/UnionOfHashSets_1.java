package com.training.day6;

import java.util.*;

public class UnionOfHashSets_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        System.out.print("Enter number of elements in Set1: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextLine());
        }

        System.out.print("Enter number of elements in Set2: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextLine());
        }

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Union: " + union);
        sc.close();
    }
}
