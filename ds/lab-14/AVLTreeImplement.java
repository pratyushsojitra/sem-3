// AVL Tree Implementation (having error in treaversal)
import java.util.*;
class Node 
{
	int info, height;
	Node left,right;
	Node(int info)
	{
		this.info = info;
		height = 1;
	}
}
class AVLTree
{
	Scanner sc = new Scanner(System.in);
	Node root;

	public int height(Node n)
	{
		if(n == null) return 0;
		System.out.println(n.height);
		return n.height;
	}

	public int getBalance(Node n)
	{
		if(n == null) return 0;
		System.out.println(height(n.left) - height(n.right));
		return height(n.left) - height(n.right);
	}
	public void insert(int x)
	{

		insert(root,x);
	}

	public Node insert(Node n, int x)
	{
		System.out.println("called");
		if(n == null) return (new Node(x));
		if(x < n.info) n.left = insert(n.left , x);
		else if(x > n.info) n.right = insert(n.right , x);
		else return n;

		 n.height = 1 + Math.max(height(n.left),height(n.right));
		 int balance = getBalance(n);
		 if(balance > 1 && x < n.left.info) return rightrotate(n);
		 if(balance < -1 && x > n.right.info) return leftrotate(n);
		 if(balance > 1 && x > n.left.info)
		 {
		 	n.left = leftrotate(n.left);
		 	return rightrotate(n);
		 }
		 if(balance < -1 && x < n.right.info)
		 {
		 	n.right = rightrotate(n.right);
		 	return leftrotate(n);
		 }
		 System.out.println("A node is Inserted"+n.info+""+n);
		 return n;
	}
	public void inorder(){
		 inorder(root);
	}
	public void inorder(Node root){
		if(root == null) return ;
		inorder(root.left);
		System.out.print(root.info + " ");
		inorder(root.right);
	}
	public Node rightrotate(Node x)
	{
		Node y = x.left;
		Node z = y.right;

		y.right =  x;
		x.left = z;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		return x;
	}
	public Node leftrotate(Node x)
	{
		Node y = x.right;
		Node z = y.left;

		y.left =  x;
		x.right = z;

		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		return x;
	}

}
public class AVLTreeImplement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AVLTree tree = new AVLTree();
		boolean flag  = true;
		while(flag)
		{
			System.out.print("Enter 1 for Insert\nEnter 2 for Inorder Traversal\nEnter 3 for Delete a Node\nEnter 4 for break : ");
			int a = sc.nextInt();
			switch(a)
			{
				case 1 : 
					System.out.print("Enter number to be Insert : ");
					int x = sc.nextInt();
					tree.insert(x);
					break;
				case 2 :
					tree.inorder();
					break;
				case 4 :
					flag = false;
					break; 		 
			}
		}
	}
}