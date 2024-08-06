import java.util.Scanner;

public class Linearserch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter element of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to serch");
        int ele = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i]==ele) {
                System.out.println("index is "+i);
            }
        }
    }
}