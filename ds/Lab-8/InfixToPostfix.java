import java.util.Scanner;

public class InfixToPostfix {

    public static int G(char next) {
        if (next == '+' || next == '-') {
            return 2;
        } else if (next == '*' || next == '/') {
            return 4;
        } else if (next == '^') {
            return 5;
        } else if (next >= 'a' && next <= 'z') {
            return 8;
        } else if (next == '(') {
            return 0;
        }
        return -1;
    }

    public static int F(char next) {
        if (next == '+' || next == '-') {
            return 1;
        } else if (next == '*' || next == '/') {
            return 3;
        } else if (next == '^') {
            return 6;
        } else if (next >= 'a' && next <= 'z') {
            return 7;
        } else if (next == '(') {
            return 9;
        } else if (next == ')') {
            return 0;
        }
        return -1;
    }

    public static int R(char next) {
        if (next == '+' || next == '-' || next == '*' || next == '/' || next == '^') {
            return -1;
        } else {
            return 1;
        }
    }

    public static String getPostfix(String infix) {
        MyStack<Character> st = new MyStack<>();
        StringBuffer postfix = new StringBuffer();
        st.push('(');
        int rank = 0;
        for (char next : infix.toCharArray()) {
            if (st.isEmpty()) {
                System.out.println("Infix is invalid.");
                return null;
            }
            else if (Character.isLetterOrDigit(next)) {
                postfix.append(next);
                rank++;
                System.out.println("rank : "+rank+",char : "+next);
                if (rank >= 1) {
                    System.out.println("Infix is invalid -- rank does not match");
                    return null;
                }
            } 
            else if (next == '+' || next == '-' || next == '*' || next == '/') {
                while (G(st.peek()) > F(next)) {
                    rank--;
                    System.out.println("rank : "+rank+",char : "+next);
                    postfix.append(st.pop());
                    if (rank < 0) {
                        System.out.println("Infix is invalid -- rank does not match");
                        return null;
                    }
                }
                st.push(next);
            } 
            else if (next == '^') {
                st.push(next);
            } 
            else if (next == '(') {
                st.push(next);
            } 
            else if (next == ')') {
                char temp2 = st.pop();
                while (temp2 != '(') {
                    postfix.append(temp2);
                    temp2 = st.pop();
                }
            }
        }
        return postfix.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix : ");
        String infix = sc.nextLine().toLowerCase() + ")";

        System.out.println("Postfix : " + getPostfix(infix));

        sc.close();
    }
}
