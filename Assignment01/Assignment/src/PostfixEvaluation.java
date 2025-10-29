import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0)))
                stack.push(Integer.parseInt(token));
            else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "^": stack.push((int)Math.pow(a, b)); break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "10 5 + 2 *"; // (10+5)*2
        System.out.println("Result = " + evaluatePostfix(expr));
    }
}
