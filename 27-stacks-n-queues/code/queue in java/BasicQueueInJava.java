import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> queue = new LinkedList<>();

        // add(E e): Adds an item to the rear of the queue. Throws an exception if the operation fails.
        queue.add(10);

        // offer(E e): Adds an item to the rear of the queue. Returns true if the operation was successful, false otherwise.
        boolean offerResult = queue.offer(20);
        System.out.println("Offer result: " + offerResult);

        // remove(): Removes and returns the item at the front of the queue. Throws an exception if the queue is empty.
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // poll(): Removes and returns the item at the front of the queue. Returns null if the queue is empty.
        Integer polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement);

        // element(): Returns the item at the front of the queue without removing it. Throws an exception if the queue is empty.
        int frontElement = queue.element();
        System.out.println("Front element: " + frontElement);

        // peek(): Returns the item at the front of the queue without removing it. Returns null if the queue is empty.
        Integer peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);
    }
}
