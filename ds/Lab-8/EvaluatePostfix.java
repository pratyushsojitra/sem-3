import java.util.Stack;

public class EvaluatePostfix {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;

                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                stack.push(num);
            } else if (isOperator(ch)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

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
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return operand1 / operand2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String postfixExpression1 = "23 34 +";
        String postfixExpression2 = "8 6 + 4 2 / -";
        String postfixExpression3 = "10 2 - 3 4 + *";

        System.out.println("Result of postfixExpression1: " + evaluatePostfix(postfixExpression1));
        System.out.println("Result of postfixExpression2: " + evaluatePostfix(postfixExpression2));
        System.out.println("Result of postfixExpression3: " + evaluatePostfix(postfixExpression3));
    }
}
