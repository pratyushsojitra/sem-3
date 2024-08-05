import java.util.Stack;

public class EvaluatePrefix {

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;
                int factor = 1;

                while (i >= 0 && Character.isDigit(expression.charAt(i))) {
                    num += (expression.charAt(i) - '0') * factor;
                    factor *= 10;
                    i--;
                }
                stack.push(num);
            }
            else if (isOperator(ch)) {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                int result = applyOperator(ch, operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int applyOperator(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+': return operand1 + operand2;
            case '-': return operand1 - operand2;
            case '*': return operand1 * operand2;
            case '/': 
                if (operand2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String prefixExpression1 = "+ 9 * 2 3";
        String prefixExpression2 = "- + 8 6 / 4 2";
        String prefixExpression3 = "* - 10 2 + 3 4"; 
        
        System.out.println("Result of prefixExpression1: " + evaluatePrefix(prefixExpression1)); // Output: 15
        System.out.println("Result of prefixExpression2: " + evaluatePrefix(prefixExpression2)); // Output: 12
        System.out.println("Result of prefixExpression3: " + evaluatePrefix(prefixExpression3)); // Output: 56
    }
}
