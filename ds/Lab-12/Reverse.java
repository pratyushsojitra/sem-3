import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element "+i+": ");
            list.insertLast(sc.nextInt());
        }
        System.out.print("Before : ");
        list.print();

        list.reverse();

        System.out.print("After : ");
        list.print();
        sc.close();
    }
}