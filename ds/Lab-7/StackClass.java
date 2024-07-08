import java.util.Scanner;

class MyStack<T> {
    T[] arr;
    int size;
    int top;
    Scanner sc = new Scanner(System.in);

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        top = -1;
    }
    @SuppressWarnings("unchecked")
    public MyStack() {
        this.size = 20;
        arr = (T[]) new Object[size];
        top = -1;
    }

    public void push(T x) {
        if (top >= size - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = x;
    }

    public T pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return arr[top--];
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        int i = top;
        System.out.print("[");
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i--;
        }
        System.out.println("]");
    }

    public T peep(int i) {
        if (top - i < 0) {
            System.out.println("Index not found");
            return null;
        }
        return arr[top];
    }

    public void change(int i, T x) {
        if (top - i < 0) {
            System.out.println("Index not found");
            return;
        }
        arr[top - i] = x;
    }

    public int size() {
        return top;
    }
}

public class StackClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of stack : ");
        int n = sc.nextInt();
        boolean check = true;

        MyStack<Integer> st = new MyStack<Integer>(n);

        while (check) {
            System.out.println("\n[1]push\n[2]pop\n[3]peep\n[4]display\n[5]change\n[6]Exit");
            System.out.print("\nEnter your choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("\nEnter number to push : ");
                    int x = sc.nextInt();
                    st.push(x);
                    break;

                case 2:
                    System.out.println("Poped number : " + st.pop());
                    break;

                case 3:
                    System.out.print("Enter index : ");
                    int i = sc.nextInt();
                    System.out.println("Numer at index " + i + " : " + st.peep(i));
                    break;

                case 4:
                    st.display();
                    break;

                case 5:
                    System.out.print("Enter index to change number : ");
                    int ind = sc.nextInt();
                    System.out.println("Enter new number : ");
                    int val = sc.nextInt();
                    st.change(ind, val);
                    break;

                case 6:
                    check = false;
                    break;
            }
        }
        sc.close();
    }
}
