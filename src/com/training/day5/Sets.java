package com.training.day5;

import java.util.*;

class Person {
    String name;
    int id;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // equals and hashCode for proper Set behavior
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return id == p.id && name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }
}

public class Sets {
    public static void main(String[] args) {
        // 1. Create Set and Add Elements
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(new Person(1, "Vani"));
        peopleSet.add(new Person(2, "Bani"));
        peopleSet.add(new Person(3, "Phani"));
        peopleSet.add(new Person(2, "Bani")); // Duplicate
        System.out.println("1. Set elements:");
        printSet(peopleSet);

        // 2. Remove duplicates from List
        List<Person> peopleList = new ArrayList<>(Arrays.asList(
            new Person(1, "Vani"),
            new Person(2, "Bani"),
            new Person(3, "Phani"),
            new Person(2, "Bani") // duplicate
        ));
        Set<Person> uniqueSet = new HashSet<>(peopleList);
        System.out.println("\n2. Unique elements from List:");
        printSet(uniqueSet);

        // 3. Check if two sets are equal
        Set<Person> anotherSet = new HashSet<>();
        anotherSet.add(new Person(3, "Phani"));
        anotherSet.add(new Person(1, "Vani"));
        anotherSet.add(new Person(2, "Bani"));
        System.out.println("\n3. Sets are equal? " + peopleSet.equals(anotherSet));

        // 4. Intersection
        Set<Person> intersection = new HashSet<>(peopleSet);
        intersection.retainAll(anotherSet);
        System.out.println("\n4. Intersection:");
        printSet(intersection);

        // 5. Union and Difference
        Set<Person> union = new HashSet<>(peopleSet);
        union.addAll(anotherSet);
        System.out.println("\n5. Union:");
        printSet(union);

        Set<Person> difference = new HashSet<>(peopleSet);
        difference.removeAll(anotherSet);
        System.out.println("\n5. Difference (peopleSet - anotherSet):");
        printSet(difference);

        // 6. Set of custom objects (already used above)

        // 7. Check if a set contains all elements of another set
        System.out.println("\n7. peopleSet contains all of anotherSet? " + peopleSet.containsAll(anotherSet));

        // 8. Convert Set to List and vice versa
        List<Person> fromSet = new ArrayList<>(peopleSet);
        Set<Person> fromList = new HashSet<>(fromSet);
        System.out.println("\n8. Converted Set -> List -> Set:");
        printSet(fromList);

        // 9. Remove specific element
        peopleSet.remove(new Person(1, "Vani"));
        System.out.println("\n9. After removing 'Vani':");
        printSet(peopleSet);

        // 10. Frequency count using Set/List
        List<String> namesList = Arrays.asList("Vani", "Phani", "Bani", "Phani", "Vani", "Vani");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String name : namesList) {
            freqMap.put(name, freqMap.getOrDefault(name, 0) + 1);
        }
        System.out.println("\n10. Frequency count:");
        freqMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    static void printSet(Set<Person> set) {
        for (Person p : set) {
            System.out.println(p);
        }
    }
}

