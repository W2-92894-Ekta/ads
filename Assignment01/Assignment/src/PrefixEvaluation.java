import java.util.Stack;

public class PrefixEvaluation {
    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (Character.isDigit(token.charAt(0)))
                stack.push(Integer.parseInt(token));
            else {
                int a = stack.pop();
                int b = stack.pop();
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
        String expr = "+ * 2 3 4"; // (2*3)+4
        System.out.println("Result = " + evaluatePrefix(expr));
    }
}
