package com.training.day3;


//public class Students {
//    private String name;
//    private int rollNo;
//    private String department;
//    private String email;
//    private String phone;
//
//    // Constructor 1
//    public Students(String name, int rollNo) {
//        this.name = name;
//        this.rollNo = rollNo;
//    }
//
//    // Constructor 2
//    public Students(String name, int rollNo, String department) {
//        this(name, rollNo);
//        this.department = department;
//    }
//
//    // Constructor 3
//    public Students(String name, int rollNo, String department, String email) {
//        this(name, rollNo, department);
//        this.email = email;
//    }
//
//    // Constructor 4
//    public Students(String name, int rollNo, String department, String email, String phone) {
//        this(name, rollNo, department, email);
//        this.phone = phone;
//    }
//}











public class Students {
    // Required fields
    private final String name;
    private final int rollNo;

    // Optional fields
    private final String department;
    private final String email;
    private final String phone;

    // Private constructor
    private Students(Builder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.department = builder.department;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static nested Builder class
    public static class Builder {
        // Required fields
        private final String name;
        private final int rollNo;

        // Optional fields
        private String department;
        private String email;
        private String phone;

        // Constructor for required fields
        public Builder(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        // Setters for optional fields
        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        // Build method to create Students
        public Students build() {
            return new Students(this);
        }
    }

    // Display method to print Students info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
