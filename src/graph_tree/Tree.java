package graph_tree;

/**
 * @author snej
 *
 *          3 
 *         / \ 
 *        1   5 
 *       / \ / \ 
 *       6 7 8 9
 * 
 */

public class Tree {
	int data;
	Tree left;
	Tree right;

	public Tree(int data) {
		this.data = data;
		this.right = this.left = null;

	}

	public Tree(int data, Tree left, Tree right) {
		this.data = data;
		this.right = right;
		this.left = left;

	}

	public int getData() {
		return data;

	}

	public void setData(int x) {
		this.data = x;

	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

}

//Driver method for traversals
class TreeTraversals {

	public static void main(String[] args) {

		System.out.println("welcome to Binary Tree Traversals program");
		Tree root = new Tree(3);
		root.left = new Tree(1, new Tree(6,new Tree(-5),null), new Tree(7));
		root.right = new Tree(5, new Tree(8), new Tree(9));

		System.out.println("\n INORDER TRAVERSAL\n");
		inorderTraversal(root);

		System.out.println("\n *************************************\n");

		System.out.println("\n PREORDER TRAVERSAL\n");
		preorderTraversal(root);

		System.out.println("\n *************************************\n");

		System.out.println("\n POSTORDER TRAVERSAL\n"); // DFS
		postOrderTraversal(root);
		System.out.println("\n *************************************\n");

		System.out.println("\n Height of a binary tree \n "); // also known as find the longest path along the root
		System.out.println(findHeight(root));
		System.out.println("\n *************************************\n");

		System.out.println("\n LEVELORDER TRAVERSAL\n"); // BFS
		levelOrderTraversal(root);
		System.out.println("\n *************************************\n");

	}

	private static int findHeight(Tree root) {
		if(root==null || root.left==null || root.right==null)
		{
			return 0;
			
		}
		int lheight=findHeight(root.left);
		int rheight=findHeight(root.right);
		if(lheight>rheight)
		{
			return lheight+1;
		}
		else
			return rheight+1;
	}
	

	private static void levelOrderTraversal(Tree root) {

	}

	private static void preorderTraversal(Tree root) {
		if (root == null) {
			return;
		}
		System.out.print(" " + root.data + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	private static void inorderTraversal(Tree root) {

		if (root == null) {
			return;
		}

		inorderTraversal(root.left);
		System.out.print(" " + root.data + " ");
		inorderTraversal(root.right);
	}

	private static void postOrderTraversal(Tree root) {
		if (root == null) {
			return;
		}

		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(" " + root.data + " ");

	}
}
