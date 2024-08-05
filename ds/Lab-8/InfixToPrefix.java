import java.util.Scanner;

public class InfixToPrefix {
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
        } else{
            return 1;
        }
    }

    public static String reverse(String exp) {
        StringBuilder reversed = new StringBuilder(exp).reverse();
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(') {
                reversed.setCharAt(i, ')');
                i++;
            } else if (reversed.charAt(i) == ')') {
                reversed.setCharAt(i, '(');
                i++;
            }
        }
        return reversed.toString();
    }

    public static String getPrefix(String infix) {

        infix = reverse(infix);

        MyStack<Character> st = new MyStack<>();
        StringBuffer prefix = new StringBuffer();
        st.push('(');
        int rank = 0;
        for (char next : infix.toCharArray()) {
            if (st.isEmpty()) {
                System.out.println("Infix is invalid.");
                return null;
            }
            else if (Character.isLetterOrDigit(next)) {
                prefix.append(next);
                rank++;
                System.out.println("rank : "+rank+",char : "+next);
                // if (rank > 1) {
                //     System.out.println("Infix is invalid -- rank does not match");
                //     return null;
                // }
            } 
            else if (next == '+' || next == '-' || next == '*' || next == '/') {
                while (G(st.peek()) > F(next)) {
                    rank--;
                    System.out.println("rank : "+rank+",char : "+next);
                    prefix.append(st.pop());
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
                    prefix.append(temp2);
                    temp2 = st.pop();
                }
            }
        }
        return prefix.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix : ");
        String infix = sc.nextLine().toLowerCase();

        System.out.println("Prefix : " + getPrefix(infix));

        sc.close();
    }
}
