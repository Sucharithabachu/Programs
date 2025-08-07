package com.mphasis.day4;

class Person {
    private String name;
    private int age;
    private static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void displayCount() {
        System.out.println("Total persons created: " + count);
    }
}

public class AssignmentQ6 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        Person p3 = new Person("Charlie", 28);

        p1.display();
        p2.display();
        p3.display();

        Person.displayCount();
    }
}
