import java.util.*;
public class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        double n = sc.nextDouble();
        System.out.print("Enter power : ");
        double pow = sc.nextDouble();
        double ans = 1;
        sc.close();
        for(;pow>0;pow--) {
            ans*=n;
        }
        System.out.print("Ans : "+ans);
    }
}