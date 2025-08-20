package com.training.day10StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Employee {
    String name;
    String dept;
    double salary;

    // Constructor for department-based example
    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    // Constructor for salary-based example
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StreamAPIAssignment {

    public static void main(String[] args) {

        // 1. Sort strings alphabetically
        List<String> fruits = Arrays.asList("banana", "apple", "mango");
        List<String> sorted = fruits.stream()
                .sorted()
                .collect(toList());
        System.out.println("1. " + sorted);

        // 2. Count strings longer than 4 chars
        List<String> animals = Arrays.asList("cat", "tiger", "lion", "crocodile");
        long count = animals.stream()
                .filter(s -> s.length() > 4)
                .count();
        System.out.println("2. " + count);

        // 3. Group employees by department
        List<Employee> employeesDept = Arrays.asList(
                new Employee("John", "IT"),
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT")
        );
        Map<String, List<String>> grouped = employeesDept.stream()
                .collect(groupingBy(e -> e.dept, mapping(e -> e.name, toList())));
        System.out.println("3. " + grouped);

        // 4. Find average salary
        List<Employee> employeesSalary = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 60000)
        );
        double avgSalary = employeesSalary.stream()
                .collect(averagingDouble(e -> e.salary));
        System.out.println("4. " + avgSalary);

        // 5. Concatenate strings with commas
        List<String> langs = Arrays.asList("Java", "Python", "C++");
        String joined = langs.stream()
                .collect(joining(", "));
        System.out.println("5. " + joined);

        // 6. Find highest paid employee
        List<Employee> employeesHigh = Arrays.asList(
                new Employee("John", 70000),
                new Employee("Alice", 95000)
        );
        Employee highest = employeesHigh.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .get();
        System.out.println("6. " + highest.name);

        // 7. Map names to their lengths
        List<String> names = Arrays.asList("Tom", "Elizabeth", "Sam");
        Map<String, Integer> nameLengths = names.stream()
                .collect(toMap(n -> n, n -> n.length()));
        System.out.println("7. " + nameLengths);

        // 8. Convert all strings to uppercase
        List<String> langs2 = Arrays.asList("java", "python");
        List<String> upper = langs2.stream()
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println("8. " + upper);

        // 9. Get first 3 numbers
        List<Integer> nums = Arrays.asList(40, 15, 25, 20, 35, 7);
        List<Integer> firstThree = nums.stream()
                .limit(3)
                .collect(toList());
        System.out.println("9. " + firstThree);
        
     // 10. Multiply all numbers using reduce
        List<Integer> numbers = Arrays.asList(40, 15, 25, 20, 35, 7);
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Q10 Output: " + product); 

        // 11. Count distinct words (case-insensitive)
        String sentence = "Java is great. JAVA is powerful.";
        long distinctWordCount = Arrays.stream(sentence.toLowerCase().split("\\W+"))
                                       .filter(w -> !w.isEmpty())
                                       .distinct()
                                       .count();
        System.out.println("Q11 Output: " + distinctWordCount); 

        // 12. Find names starting with 'A'
        List<String> names1 = Arrays.asList("Alice", "Bob", "Andrew", "Tom");
        List<String> namesWithA = names1.stream()
                                       .filter(name -> name.startsWith("A"))
                                       .collect(Collectors.toList());
        System.out.println("Q12 Output: " + namesWithA); 

        // 13. Find longest string
        List<String> animals1 = Arrays.asList("cat", "elephant", "dog");
        String longest = animals1.stream()
                                .max(Comparator.comparingInt(String::length))
                                .orElse("");
        System.out.println("Q13 Output: " + longest); // elephant

        // 14. Count occurrences of each word
        String text = "apple banana apple orange banana apple";
        Map<String, Long> wordCount = Arrays.stream(text.split(" "))
                                            .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println("Q14 Output: " + wordCount); 

        // 15. Join uppercase names with delimiter
        List<String> people = Arrays.asList("john", "alice", "mark");
        String joined1 = people.stream()
                              .map(String::toUpperCase)
                              .collect(Collectors.joining(" "));
        System.out.println("Q15 Output: " + joined1);
    }
}
