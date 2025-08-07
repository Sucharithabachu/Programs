package com.mphasis.day2;

import java.util.*;

public class JavaDay2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1. Reverse String
        System.out.println("Enter the String which you want to reverse:");
        String strIp = sc.nextLine();
        String reversedString = reverseString(strIp);
        System.out.println("Reversed String: " + reversedString);

        // 2. Count Vowels and Consonants
        System.out.println("\nEnter a String to count number of Vowels and Consonants:");
        String strvc = sc.nextLine();
        countVowelsandConsonants(strvc);

        // 3. Anagram check
        System.out.println("\nEnter the first String:");
        String stra1 = sc.nextLine();
        System.out.println("Enter the second String:");
        String stra2 = sc.nextLine();
        checkAnagramorNot(stra1, stra2);

        // 4. Remove duplicate characters
        System.out.println("\nEnter a String to remove duplicate characters:");
        String strd = sc.nextLine();
        duplicateChars(strd);

        // 5. HackerRank Lexicographic String Compare
        System.out.println("\nEnter a string for HackerRank lexicographic comparison:");
        String hStr = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        hackerRankStringCompare(hStr, k);
    }

    // 1. Reverse String
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        String revString = "";
        for (int i = 0; i < charArray.length; i++) {
            revString += charArray[charArray.length - 1 - i];
        }
        return revString;
    }

    // 2. Count Vowels and Consonants
    public static void countVowelsandConsonants(String strvc) {
        strvc = strvc.toLowerCase();
        char[] charArr = strvc.toCharArray();
        int vCount = 0;
        int cCount = 0;

        for (char ch : charArr) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                } else {
                    cCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vCount);
        System.out.println("Consonant Count: " + cCount);
    }

    // 3. Check if two strings are anagrams
    public static void checkAnagramorNot(String stra1, String stra2) {
        stra1 = stra1.replaceAll("\\s+", "").toLowerCase();
        stra2 = stra2.replaceAll("\\s+", "").toLowerCase();

        char[] charArr1 = stra1.toCharArray();
        char[] charArr2 = stra2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        boolean res = Arrays.equals(charArr1, charArr2);
        if (res) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }

    // 4. Remove duplicate characters
    public static String duplicateChars(String strd) {
        char[] chars = strd.toCharArray();
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII tracker

        for (char ch : chars) {
            char lower = Character.toLowerCase(ch); // case-insensitive check
            if (!seen[lower]) {
                seen[lower] = true;
                result.append(ch);
            }
        }

        String finalResult = result.toString();
        System.out.println("After removing duplicates: " + finalResult);
        return finalResult;
    }

    // 5. HackerRank: Lexicographically smallest and largest substrings
    public static void hackerRankStringCompare(String str, int k) {
        String smallest = str.substring(0, k);
        String largest = str.substring(0, k);

        for (int i = 1; i <= str.length() - k; i++) {
            String substr = str.substring(i, i + k);

            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }

        System.out.println("Smallest substring: " + smallest);
        System.out.println("Largest substring: " + largest);
    }
}
