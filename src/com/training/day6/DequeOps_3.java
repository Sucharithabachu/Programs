package com.training.day6;

import java.util.*;


public class DequeOps_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new LinkedList<>();

        System.out.print("Enter first element: ");
        deque.addFirst(sc.nextLine());

        System.out.print("Enter last element: ");
        deque.addLast(sc.nextLine());

        System.out.println("Deque: " + deque);

        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        System.out.println("Final Deque: " + deque);
        sc.close();
    }
}
