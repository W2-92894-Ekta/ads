import java.util.Scanner;

class LinearQueue {
    private int[] arr;
    private int front, rear, size;

    public LinearQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = 0; // both start at 0
    }

    public boolean isFull() {
        return rear == size;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void enqueue(int val) {
        if (isFull())
            System.out.println("Queue is Full!");
        else
            arr[rear++] = val;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        } else
            return arr[front++];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is Empty!");
        else {
            System.out.print("Queue: ");
            for (int i = front; i < rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearQueue q = new LinearQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
