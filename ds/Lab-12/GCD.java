import java.util.Scanner;

class NewMyLinkedList {

    Node head = null;
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

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }
    
    public void gcd() {
        if (isEmpty() || head.next==null) {
            return;
        }

        Node curNode = head, nxtNode = head.next;
        while(nxtNode!=null) {
            Node gcd = new Node(calculateGCD(curNode.val, nxtNode.val));

            curNode.next = gcd;
            gcd.next = nxtNode;

            curNode = nxtNode;
            nxtNode = nxtNode.next;
        }
    }
    public int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a < b) {
            return calculateGCD(b, a);
        }
        return calculateGCD(b, a % b);
    }

    public void print() {
        Node curNode = head;
        System.out.print("{ ");
        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
        System.out.println("}");
    }
}
public class GCD {
    public static void main(String[] args) {
        NewMyLinkedList list = new NewMyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of elements : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element "+i+": ");
            list.insertLast(sc.nextInt());
        }
        System.out.print("Before : ");
        list.print();

        list.gcd();

        System.out.print("After : ");
        list.print();
        sc.close();
    }
}
