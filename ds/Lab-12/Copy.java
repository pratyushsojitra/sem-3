import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element "+i+": ");
            list1.insertLast(sc.nextInt());
        }
        System.out.print("List 1: ");
        list1.print();

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2 = list1.cloneList();

        System.out.print("List 2: ");
        list2.print();
        sc.close();
    }
}