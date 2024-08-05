import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList<Integer> list = new MyLinkedList<>();
        
        System.out.println("Enter elements into list.");
        System.out.print("Enter number of elements you want to enter : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            list.insertLast(sc.nextInt());
        }

        System.out.print("Before : ");
        list.print();

        list.removeDuplicates();
        
        System.out.print("After : ");
        list.print();        
        sc.close();
    }
}
