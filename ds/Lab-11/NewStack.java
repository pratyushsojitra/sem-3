public class NewStack<T> {
    Node head;
    int size;

    public NewStack() {
        head = null;
        size = 0;
    }

    public NewStack(T val) {
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

    public void push(T val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public T peek() {
        return head.val;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = head.val;
        head = head.next;

        return data;
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
        NewStack<Integer> st = new NewStack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("peek : "+st.peek());
        System.out.println("pop : "+st.pop());

        System.out.print("stack : { ");
        while (!st.isEmpty()) {
            System.out.print(st.pop()+" ");
        }
        System.out.println("}");
    }
}