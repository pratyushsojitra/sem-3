import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    Node head;
    int size;

    public MyQueue() {
        head = null;
        size = 0;
    }

    public MyQueue(T val) {
        this.head = new Node(val);
        size = 1;
    }

    class Node {
        T val;
        Node prev;
        Node next;

        public Node(T val) {
            this.val = val;
            this.prev = null;
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

    public void add(T val) {
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
        newNode.prev = curNode;
    }

    public T peek() {
        return head.val;
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }
        T val = head.val;
        head = head.next;

        return val;
    }

    public void remove(T val) {
        if (isEmpty()) {
            System.out.println("LinkedList is empty.");
            return;
        }
        if (head.val == val) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        Node curNode = head.next;
        while (curNode != null && curNode.val != val) {
            curNode = curNode.next;
        }
        if (curNode == null) {
            System.out.println("val not found");
            return;
        }
        curNode.prev.next = curNode.next;
        size--;
    }

    public void remove(int ind) {
        if (head == null) {
            System.out.println("Under-Flow");
            return;
        }
        if (ind == 1) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        Node curNode = head;
        while (ind-->0 && curNode.next!=null) {
            curNode = curNode.next;
        }
        if (curNode.next==null) {
            System.out.println("Index not foun");
            return;
        }
        curNode.next = curNode.next.next;
        curNode.next.prev = curNode; 
        System.out.println("Node removed SucessFully");
        size--;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }
        Node curNode = head;
        System.out.print("{");
        while (curNode!=null) {
            System.out.print(curNode.val+" ");
            curNode = curNode.next;
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("peek : "+q.peek());
        System.out.println("pop : "+q.poll());

        System.out.print("stack : { ");
        while (!q.isEmpty()) {
            System.out.print(q.poll()+" ");
        }
        System.out.println("}");
    }
}
