import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days : ");
        int days = sc.nextInt();
        int year = days/365;
        days%=365;
        int week = days/7;
        days%=7;
        System.out.println("year "+year+" week "+week+" days "+days);
        sc.close();
    }
}
