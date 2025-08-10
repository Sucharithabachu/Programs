package com.training.day6;

import java.util.*;

public class PriorityQueueOps_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter number of elements to add in PriorityQueue: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek: " + pq.peek());

        System.out.println("Removing element: " + pq.poll());
        System.out.println("After removal: " + pq);

        sc.close();
    }
}

