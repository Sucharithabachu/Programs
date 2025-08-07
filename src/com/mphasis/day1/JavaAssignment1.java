package com.mphasis.day1;
import java.util.Scanner;

public class JavaAssignment1 {

    public static void main(String[] args) {
        swapTwoNumbers();
        multiplyFloatNumbers();
        checkEvenOrOdd();
        calculateAreaOfCircle();
        checkPositiveNegativeZero();
        findFactorial();
        findLargestOfThree();
        findSumOfDigits();
        checkPrime();
        printFibonacciSeries();
        reverseNumber();
        convertCelsiusToFahrenheit();
    }

    public static void swapTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Swap Two Numbers (Using Temp Variable)");
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void multiplyFloatNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n2. Multiply Two Floating-Point Numbers");
        System.out.print("Enter first number: ");
        float f1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float f2 = sc.nextFloat();
        float result = f1 * f2;
        System.out.println("Multiplication result: " + result);
    }

    public static void checkEvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n3. Check if a Number is Even or Odd");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is Even.");
        else
            System.out.println(num + " is Odd.");
    }

    public static void calculateAreaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n4. Calculate Area of a Circle");
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area of the circle: " + area);
    }

    public static void checkPositiveNegativeZero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n5. Check if Number is Positive, Negative, or Zero");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("The number is Positive.");
        else if (num < 0)
            System.out.println("The number is Negative.");
        else
            System.out.println("The number is Zero.");
    }

    public static void findFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n6. Find Factorial of a Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static void findLargestOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n7. Find Largest of Three Numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("The largest number is: " + largest);
    }

    public static void findSumOfDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n8. Find Sum of Digits");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n9. Check Prime Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }

    public static void printFibonacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n10. Print Fibonacci Series");
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void reverseNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n11. Reverse a Number");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    public static void convertCelsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n12. Convert Celsius to Fahrenheit");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");
    }
}
