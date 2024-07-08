import java.util.*;

public class ABForm {
    public static void main(String[] args) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string which have only a and b : ");
        String str = sc.next();
        for(char c : str.toCharArray()) {
            if(c=='a') {
                s1.push(c);
            }
            else {
                s2.push(c);
            }
        }
        int size= str.length();
        if ((size%2)!=0) {
            System.out.println("this is false");
        }
        else{
            if (s1.size()==s2.size()) {
                System.out.println("this is true");
            }
            else{
                System.out.println("this is false");
            }
        }
        sc.close();
    }
}
