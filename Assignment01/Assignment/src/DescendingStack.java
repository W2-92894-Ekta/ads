class DescendingStack {
    private int SIZE = 5;
    private int[] stack = new int[SIZE];
    private int top = SIZE; // starts from SIZE

    public boolean isFull() {
        return top == 0;
    }

    public boolean isEmpty() {
        return top == SIZE;
    }

    public void push(int val) {
        if (isFull())
            System.out.println("Stack is Full!");
        else
            stack[--top] = val; // decrease top first
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        } else
            return stack[top++];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is Empty!");
        else {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i < SIZE; i++)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DescendingStack s = new DescendingStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}
