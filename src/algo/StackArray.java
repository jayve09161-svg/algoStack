package algo;

public class StackArray {

    // Attribute/Variable (GLOBAL)
    private int[] stack;
    private int top;
    private int capacity;

    // constructor
    public StackArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Empty?: " + stack.isEmpty());
        System.out.println("Full?: " + stack.isFull());

        stack.push(60);
    }

    // Push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println("Pushed at " + top + ": " + value);
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    // top method / pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull method
    public boolean isFull() {
        return top == capacity - 1;
    }
}