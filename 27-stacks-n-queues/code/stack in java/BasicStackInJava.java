// In Java, a stack is a linear data structure that follows the Last In, First Out (LIFO) principle. 
// This means that the most recently added element is the one that gets removed first. Here's a brief
// description of the Stack class in Java along with its methods:

// 1- push(E item): Adds an item to the top of the stack.
// 2- pop(): Removes and returns the item at the top of the stack.
// 3- peek(): Returns the item at the top of the stack without removing it.
// 4- empty(): Returns true if the stack is empty, false otherwise.
// 5- search(Object o): Searches for the specified object in the stack and returns its position as the distance
//                      from the top of the stack (indexing starts from 1). Returns -1 if the object is not found.


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // push(E item): Adds an item to the top of the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // pop(): Removes and returns the item at the top of the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // peek(): Returns the item at the top of the stack without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // empty(): Returns true if the stack is empty, false otherwise
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty);

        // search(Object o): Searches for the specified object in the stack
        // and returns its position as the distance from the top of the stack (indexing starts from 1).
        // Returns -1 if the object is not found.
        int position = stack.search(20);
        if (position != -1) {
            System.out.println("Element 20 found at position: " + position);
        } else {
            System.out.println("Element 20 not found in the stack.");
        }
    }
}
