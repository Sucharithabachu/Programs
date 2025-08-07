package com.mphasis.day2;
import java.util.*;

public class JavaDay2Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] numberBox = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numberBox[i] = input.nextInt();
        }

        // Calling the methods
        findTopNumber(numberBox);              // 1. Largest element
        showOnlyEvens(numberBox);              // 2. Filter even numbers
        computeTotalSum(numberBox);            // 3. Sum of array
        sortUsingLibrary(numberBox);           // 4. Built-in sort
        manualBubbleSort(numberBox.clone());   // 5. Bubble sort
        displayUniqueItems(numberBox);         // 6. Distinct elements
        demoNestedArrayFlattening();           // 7. Flatten nested array (hardcoded)
    }

    // 1. Find max value
    public static void findTopNumber(int[] dataList) {
        int highest = dataList[0];
        for (int value : dataList) {
            if (value > highest) highest = value;
        }
        System.out.println("1️⃣ Highest number: " + highest);
    }

    // 2. Print even numbers
    public static void showOnlyEvens(int[] dataList) {
        System.out.print("2️⃣ Even numbers: ");
        for (int value : dataList) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println();
    }

    // 3. Sum of array
    public static void computeTotalSum(int[] dataList) {
        int total = 0;
        for (int value : dataList) {
            total += value;
        }
        System.out.println("3️⃣ Total sum: " + total);
    }

    // 4. Sort using Arrays.sort()
    public static void sortUsingLibrary(int[] dataList) {
        int[] sortedCopy = dataList.clone();
        Arrays.sort(sortedCopy);
        System.out.println("4️⃣ Sorted using Arrays.sort: " + Arrays.toString(sortedCopy));
    }

    // 5. Manual Bubble Sort
    public static void manualBubbleSort(int[] unsortedList) {
        int n = unsortedList.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (unsortedList[j] > unsortedList[j + 1]) {
                    int temp = unsortedList[j];
                    unsortedList[j] = unsortedList[j + 1];
                    unsortedList[j + 1] = temp;
                }
            }
        }
        System.out.println("5️⃣ Sorted using bubble sort: " + Arrays.toString(unsortedList));
    }

    // 6. Distinct elements without Set
    public static void displayUniqueItems(int[] dataList) {
        System.out.print("6️⃣ Unique values: ");
        for (int i = 0; i < dataList.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (dataList[i] == dataList[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(dataList[i] + " ");
            }
        }
        System.out.println();
    }

    // 7. Flatten nested array
    public static void demoNestedArrayFlattening() {
        Object[] nestedArray = {
                new Object[]{10, 20},
                new Object[]{30},
                new Object[]{40, new Object[]{50, 60}, 70}
        };

        List<Integer> flatList = new ArrayList<>();
        flattenRecursively(nestedArray, flatList);

        System.out.println("7️⃣ Flattened array: " + flatList);
    }

    // Helper method for recursive flattening
    public static void flattenRecursively(Object[] input, List<Integer> output) {
        for (Object element : input) {
            if (element instanceof Integer) {
                output.add((Integer) element);
            } else if (element instanceof Object[]) {
                flattenRecursively((Object[]) element, output);
            }
        }
    }
}
