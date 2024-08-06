import java.util.Scanner;

public class Binaryserch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter element in sorting in accerding of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to serch");
        int ele = sc.nextInt();

        if (arr[size / 2] == ele) {
            System.out.println("index is :" + size/2);
        } else if (arr[size / 2] > ele) {
            for (int i = 0; i < size / 2; i++) {
                if (arr[i] == ele) {
                    System.out.println("index is " + i);
                }
            }
        } else {
            for (int i = size / 2; i < size; i++) {
                if (arr[i] == ele) {
                    System.out.println("index is " + i);
                }
            }
        }
    }
}
