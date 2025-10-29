import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Stack<Integer> stack = new Stack<>();

        for (int val : arr)
            stack.push(val);

        for (int i = 0; i < arr.length; i++)
            arr[i] = stack.pop();

        System.out.print("Reversed Array: ");
        for (int val : arr)
            System.out.print(val + " ");
    }
}
