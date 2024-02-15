// In Java, you can set priorities to the items of a PriorityQueue by providing a Comparator
// or implementing the Comparable interface for the elements.

// Using Comparator:  
//                     You can create a custom Comparator to define the ordering based on the 
//                     priorities of the elements. Here's a code sample demonstrating how to 
//                     set priorities using a Comparator:

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityExample {
    public static void main(String[] args) {
        // Creating a priority queue with a custom Comparator
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Higher numbers have higher priority
                return o2 - o1;
            }
        });

        // Adding elements with priorities
        priorityQueue.add(10);  // Priority: 10
        priorityQueue.add(30);  // Priority: 30
        priorityQueue.add(20);  // Priority: 20

        // Removing elements
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}


// Using Comparable: 
//                     Alternatively, you can have the elements themselves implement the Comparable interface 
//                     to define their natural ordering. Here's a code sample illustrating this approach:


import java.util.PriorityQueue;

public class PriorityExample {
    public static void main(String[] args) {
        // Creating a priority queue without a Comparator
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements with priorities
        priorityQueue.add(10);  // Priority: 10
        priorityQueue.add(30);  // Priority: 30
        priorityQueue.add(20);  // Priority: 20

        // Removing elements
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}