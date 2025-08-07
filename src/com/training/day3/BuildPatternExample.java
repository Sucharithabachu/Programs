package com.training.day3;

public class BuildPatternExample {
    public static void main(String[] args) {
        // Creating a Student object using Builder pattern
        Students student = new Students.Builder("Neil", 222004012)
                                .department("ECE")
                                .email("Neil@example.com")
                                .phone("9012345678")
                                .build();

        // Displaying student details
        student.displayInfo();
    }
}
