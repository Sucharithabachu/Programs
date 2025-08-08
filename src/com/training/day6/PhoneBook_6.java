package com.training.day6;

import java.util.*;

public class PhoneBook_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNum = sc.nextLine();
            phoneBook.put(name, phoneNum);
        }

        System.out.println("Phone Book: " + phoneBook);
        sc.close();
    }
}

