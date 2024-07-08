import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println("(recursion)factorial is : "+fact(num));
        int fact=1;
        sc.close();
        for(;num>0;num--){
            fact *= num;
        }
        System.out.println("(loop)factorial is : "+fact);
    }
    public static int fact(int num) {
        if(num==1)
            return 1;
        return num*fact(num-1);
    }
}