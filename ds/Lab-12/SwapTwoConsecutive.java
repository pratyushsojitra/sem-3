import java.util.Scanner;

class NewMyLinkedList {

    Node head;
    int size = 0;

    class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (head==null) {
            head = newNode;
            return;
        }
        Node curNodeNode = head;
        while (curNodeNode.next != null) {
            curNodeNode = curNodeNode.next;
        }
        curNodeNode.next = newNode;
    }

    public void print() {
        Node curNodeNode = head;
        System.out.print("{ ");
        while (curNodeNode != null) {
            System.out.print(curNodeNode.val + " ");
            curNodeNode = curNodeNode.next;
        }
        System.out.println("}");
    }

    public void swap() {
        if (head==null || head.next==null) {
            return;
        }
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevNode = dummy;
        Node curNode = head;

        while (curNode != null && curNode.next != null) {
            Node nxtNode = curNode.next;

            curNode.next = nxtNode.next;
            nxtNode.next = curNode;
            prevNode.next = nxtNode;

            prevNode = curNode;
            curNode = curNode.next;
        }
        head = dummy.next;
    }
}
public class SwapTwoConsecutive {
    public static void main(String[] args) {
        NewMyLinkedList list = new NewMyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            list.insertLast(sc.nextInt());
        }
        System.out.print("Before : ");
        list.print();

        list.swap();

        System.out.print("After : ");
        list.print();
        sc.close();
    }
}
