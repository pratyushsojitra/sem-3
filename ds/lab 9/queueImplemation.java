import java.util.Scanner;

public class queueImplemation {
    int front, rear, n;
    int a[];

    queueImplemation(int n) {
        front = -1;
        rear = -1;
        this.n = n;
        a = new int[n];
    }

    void Enqueue(int element) {
        if (rear >= n - 1) {
            System.out.println("queue overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = rear + 1;
            a[rear] = element;
        }

    }

    int Dequeue() {
        int y;
        if (front == -1) {
            return -1;
        } else {
            y = a[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = front + 1;
            }
            return y;
        }
    }

    void display() {
        System.out.println("queue is :");
        for (int i = front; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Queue size:");
        queueImplemation q1 = new queueImplemation(sc.nextInt());
        while (true) {
            System.out.println("Enter number to perfome this operation \n 1.Enqueue \n 2.dequeue \n 3.display \n" + //
                    " 0.Exit");
            int a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("enter number to insert at first");
                    int b = sc.nextInt();
                    q1.Enqueue(b);
                    break;

                case 2:
                    int x = q1.Dequeue();
                    if (x == -1) {
                        System.out.println("queue underflow");
                    } else {
                        System.out.println("deleted element is:" + x);
                    }
                    break;

                case 3:
                    System.out.println("display : ");
                    q1.display();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("number is wrong, enter valid number");
                    break;
            }

        }
    }
}