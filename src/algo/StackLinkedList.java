package algo;

public class StackLinkedList {

    // Node class
    private class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top of the stack
    private Node top;

    // Constructor
    public StackLinkedList() {
        top = null;
    }

    // Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Remove and return the top element of the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow! The stack is empty.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // View the top element without removing it
    public int peek() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return top.data;
    }

    // Display all elements in the stack
    public void display() {
        if (top == null) {
            System.out.println("The stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Create a stack
        StackLinkedList stack = new StackLinkedList();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println();

        // Display stack
        stack.display();

        // View top element
        System.out.println("Top element: " + stack.peek());

        // Remove an element
        System.out.println("Removed: " + stack.pop());

        // View top again
        System.out.println("Top element: " + stack.peek());

        // Display stack again
        stack.display();
    }
}