package algo;

public class queueArray {

    private int[] queue = new int[5];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear++;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = queue[front];
        front++;
        size--;
        return value;
    }

    public void displayQueue() {

        for (int i = front; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }

    }

    public static void main(String[] args) {
        queueArray q = new queueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("size: ");
        q.displayQueue();

        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());
        System.out.println("Deleted: " + q.dequeue());

        System.out.println("size: " + q.size);

        q.displayQueue();

    }

}
