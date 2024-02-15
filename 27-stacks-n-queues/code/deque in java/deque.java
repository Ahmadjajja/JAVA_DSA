// A Deque in Java, short for "Double Ended Queue," is a linear collection that supports insertion 
// and removal of elements from both ends. It allows for both stack-like (Last-In-First-Out) and 
// queue-like (First-In-First-Out) operations. In Java, the Deque interface provides a set of methods
// for performing these operations. 
// Here's a brief overview of the methods using code available in the Deque interface:

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // void addFirst(E e)
        deque.addFirst(1);

        // void addLast(E e)
        deque.addLast(2);

        // boolean offerFirst(E e)
        deque.offerFirst(0);

        // boolean offerLast(E e)
        deque.offerLast(3);

        // E removeFirst()
        int first = deque.removeFirst();
        System.out.println("Removed first element: " + first);

        // E removeLast()
        int last = deque.removeLast();
        System.out.println("Removed last element: " + last);

        // E pollFirst()
        Integer firstOrNull = deque.pollFirst();
        System.out.println("Polled first element: " + firstOrNull);

        // E pollLast()
        Integer lastOrNull = deque.pollLast();
        System.out.println("Polled last element: " + lastOrNull);

        // E getFirst()
        int firstElement = deque.getFirst();
        System.out.println("First element: " + firstElement);

        // E getLast()
        int lastElement = deque.getLast();
        System.out.println("Last element: " + lastElement);

        // E peekFirst()
        Integer peekFirst = deque.peekFirst();
        System.out.println("Peeked first element: " + peekFirst);

        // E peekLast()
        Integer peekLast = deque.peekLast();
        System.out.println("Peeked last element: " + peekLast);

        // boolean removeFirstOccurrence(Object o)
        boolean removedFirstOccurrence = deque.removeFirstOccurrence(2);
        System.out.println("Removed first occurrence of 2: " + removedFirstOccurrence);

        // boolean removeLastOccurrence(Object o)
        boolean removedLastOccurrence = deque.removeLastOccurrence(0);
        System.out.println("Removed last occurrence of 0: " + removedLastOccurrence);

        // boolean add(E e)
        boolean added = deque.add(4);
        System.out.println("Element added at end: " + added);

        // boolean offer(E e)
        boolean offered = deque.offer(5);
        System.out.println("Element offered at end: " + offered);

        // E remove()
        int removed = deque.remove();
        System.out.println("Removed element at first: " + removed);

        // E poll()
        Integer polled = deque.poll();
        System.out.println("Polled element at first: " + polled);

        // E element()
        int element = deque.element();
        System.out.println("Element at first: " + element);

        // E peek()
        Integer peeked = deque.peek();
        System.out.println("Peeked element at first: " + peeked);
    }
}
