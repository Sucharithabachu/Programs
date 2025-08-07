package com.mphasis.day4;



//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;
class Student {
 int id;
 String name;

 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public String toString() {
     return id + " - " + name;
 }
}

public class Lists {

 public static void main(String[] args) {
     createAndDisplayList();
     removeEvenNumbers();
     findMaxMin();
     sortList();
     reverseList();
     checkIfListContains();
     findDuplicatesInList();
     convertArrayToList();
     mergeTwoLists();
     listOfCustomObjects();
 }

 // 1. Create and display a list of integers
 public static void createAndDisplayList() {
     List<Integer> nums = new ArrayList<>();
     for (int i = 1; i <= 10; i++) {
         nums.add(i * 2);
     }
     System.out.println("Original List: " + nums);
 }

 // 2. Remove even numbers
 public static void removeEvenNumbers() {
     List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
     numbers.removeIf(n -> n % 2 == 0);
     System.out.println("List after removing even numbers: " + numbers);
 }

 // 3. Find max and min
 public static void findMaxMin() {
     List<Integer> list = Arrays.asList(5, 10, 3, 99, 1, 43, 50);
     int max = Collections.max(list);
     int min = Collections.min(list);
     System.out.println("Max: " + max + ", Min: " + min);
 }

 // 4. Sort list ascending & descending
 public static void sortList() {
     List<Integer> list = new ArrayList<>(Arrays.asList(10, 3, 5, 2, 8, 6));
     Collections.sort(list);
     System.out.println("Sorted Ascending: " + list);

     list.sort(Collections.reverseOrder());
     System.out.println("Sorted Descending: " + list);
 }

 // 5. Reverse list
 public static void reverseList() {
     List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
     Collections.reverse(list);
     System.out.println("Reversed with built-in: " + list);

     // Manual reverse
     List<Integer> manualReverse = new ArrayList<>();
     for (int i = list.size() - 1; i >= 0; i--) {
         manualReverse.add(list.get(i));
     }
     System.out.println("Reversed manually: " + manualReverse);
 }

 // 6. Check if list contains a string
 public static void checkIfListContains() {
     List<String> words = Arrays.asList("apple", "banana", "grape");
     String target = "banana";
     System.out.println("List contains '" + target + "'? " + words.contains(target));
 }

 // 7. Find duplicates
 public static void findDuplicatesInList() {
     List<String> list = Arrays.asList("a", "b", "c", "a", "d", "b", "e");
     Set<String> seen = new HashSet<>();
     Set<String> duplicates = new HashSet<>();

     for (String s : list) {
         if (!seen.add(s)) {
             duplicates.add(s);
         }
     }
     System.out.println("Duplicates: " + duplicates);
 }

 // 8. Convert array to list
 public static void convertArrayToList() {
     String[] arr = { "Java", "Python", "C++" };
     List<String> list = new ArrayList<>(Arrays.asList(arr));
     System.out.println("Converted List: " + list);
 }

 // 9. Merge two lists without using built-in addAll()
 public static void mergeTwoLists() {
     List<Integer> list1 = Arrays.asList(1, 2, 3);
     List<Integer> list2 = Arrays.asList(4, 5, 6);
     List<Integer> merged = new ArrayList<>();

     for (Integer i : list1) merged.add(i);
     for (Integer i : list2) merged.add(i);

     System.out.println("Merged List: " + merged);
 }

 // 10. List of custom objects and sort by name
 public static void listOfCustomObjects() {
     List<Student> students = new ArrayList<>();
     students.add(new Student(1, "Kriti"));
     students.add(new Student(2, "sonal"));
     students.add(new Student(3, "Vaishnavi"));

     students.sort(Comparator.comparing(s -> s.name));
     System.out.println("Sorted Students by name:");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}