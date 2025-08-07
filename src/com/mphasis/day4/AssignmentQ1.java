package com.mphasis.day4;

import java.util.Scanner;

// Base class
abstract class Shape {
    abstract double calculateArea();
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double width, length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        return width * length;
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle input
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Rectangle input
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        // Triangle input
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        Shape triangle = new Triangle(base, height);
        System.out.println("Triangle Area: " + triangle.calculateArea());

        sc.close();
    }
}
