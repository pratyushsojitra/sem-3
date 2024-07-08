import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int term = 0, sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         sum+=j;
        //     }
        // }
        for (int i = 1; i <= n; i++) {
            term+=i;
            sum+=term;
        }
        System.out.println("Sum : "+sum);
        sc.close();
    }
}
