import java.util.Scanner;
import java.util.Stack;

public class Evalupost {
    static int Perform_operation(int operand1, int operand2, char ch) {
        int result = 0;

        switch (ch) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '^':
                result = operand1 ^ operand2;
                break;
        }
        return result;
    }

    static int postfixEvaluation(String expression)
    {
        Stack<Integer> s1 = new Stack<>();
        int operand2;
        int operand1;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                s1.push(Integer.parseInt(ch+""));
            } else {
                operand2 = s1.pop();
                operand1 = s1.pop();
                int value = Perform_operation(operand1, operand2, ch);
                s1.push(value);
            }
        }
        return s1.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string which contain operators and digit");
        String str = sc.next();

        System.out.print("Postfix Evaluation Result is "+ postfixEvaluation(str));
        sc.close();
    }
}
