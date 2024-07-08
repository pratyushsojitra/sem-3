import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter second : ");
        int sec = sc.nextInt();
            int h = sec/3600;
            sec%=3600;
            int m = sec/60;
            int s=sec%60;
        System.out.println(h+":"+m+":"+s);
        sc.close();
    }
}
