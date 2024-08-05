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
        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    
    public void sort() {
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            return;
        }
        Node curNode = head;

        while (curNode != null) {
            Node fNode = curNode, sNode = curNode.next;
            while (sNode != null) {
                if (sNode.val < fNode.val) {
                    int temp = fNode.val;
                    fNode.val = sNode.val;
                    sNode.val = temp;
                }
                sNode = sNode.next;
                fNode = fNode.next;
            }
            curNode = curNode.next;
        }
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

public class Sort {
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

        list.sort();

        System.out.print("After : ");
        list.print();
        sc.close();
    }
}
