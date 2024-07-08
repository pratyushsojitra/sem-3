import java.util.*;

public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num==0)
            System.out.println("Number is 0");
        else if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
        sc.close();
    }
}