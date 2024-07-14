public class allmethodll {
    Node head = null;
    int size=0;
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    public static void insertatlast(int val,Node head) {
        Node temp=new Node(val);
        Node t = head;
        while (t.next!=null) {
            t=t.next;
        }
        t.next=temp;
    
    }

    public static void displayfirst(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void displaysecond(Node head) {
        if (head != null)
            return;
        System.out.println(head.data + " ");
        displaysecond(head.next);
    }

    public static void displayreverse(Node head) {
        if (head != null)
            displayreverse(head.next);
        System.out.println(head.data + " ");

    }

    public static int displaylength(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node x = new Node(1);
        Node w = new Node(1);
        Node e = new Node(1);
        Node r = new Node(1);
        a.next=b;
        b.next=x;
        x.next=w;
        w.next=e;
        e.next=r;
        insertatlast(25,a);
        displayfirst(a);
    }
}
