import java.util.Scanner;

public class implementionll {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinekdList {
        Node head = null;
        Node last = null;
        int size=0;
        void insertatend(int val) {
            Node newnode = new Node(val);

            if (head == null) {
                head = newnode;

            } else {
                last.next = newnode;

            }
            last = newnode;
            size++;
        }

        void deleteAt(int idx) {
            Node temp = head;
            if (idx < 0 || idx > size) {
                System.out.println("wrong index");
            }
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        // int size() {
        //     int count = 0;
        //     Node newnode = head;
        //     while (newnode != null) {
        //         count++;
        //         newnode = newnode.next;
        //     }
        //     return count;
        // }

        void display() {
            Node newnode = head;
            while (newnode != null) {
                System.out.print(newnode.data + " ");
                newnode = newnode.next;
            }
        }

        void insertatfirst(int val) {
            Node temp = new Node(val);
            if (head == null) {// empty list
                head = temp;
                last = temp;
            } else {// non empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        int geteleat(int id) {
            Node temp = head;
            if (id < 0 && id > size) {
                return -1;
            }
            for (int i = 1; i <= id; i++) {
                temp = temp.next;
            }
            return temp.data;

        }

        void insertatind(int id, int val) {
            Node newnnode = new Node(val);
            Node temp = head;
            if (id == 0) {
                insertatfirst(val);
                return;

            } else if (id == size) {
                insertatend(val);
                return;
            } else if (id < 0 && id > size) {
                System.out.println("wrong index");
            }
            for (int i = 1; i <= id - 1; i++) {
                temp = temp.next;
            }
            newnnode.next = temp.next;
            temp.next = newnnode;
            size++;
        }

    }

    public static void main(String[] args) {
        LinekdList ll = new LinekdList();
       Scanner sc = new Scanner(System.in);
        int data;
        boolean check = true;
        while (check) {
            System.out.println("\n[1] Insert at first\n[2] Insert at last\n[3] Remove\n[4] Print\n[5] Size\n[6] Exit");
            System.out.print("\nEnter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    ll.insertatfirst(data);
                    break;

                case 2:
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    ll.insertatend(data);
                    break;

                case 3:
                    System.out.print("Enter number to remove from index : ");
                    data = sc.nextInt();
                    ll.deleteAt(data);
                    break;

                case 4:
                    ll.display();
                    break;

                case 5:
                    System.out.println("size :"+ll.size);
                    break;

                case 6:
                    check = false;
                    break;
            }
        }
        sc.close();

    }
}
