package graph_tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS_levelorder_tree {
	public static void main(String[] args) {
		System.out.println("welcome to BFS Tree Traversal program");
		Tree root = new Tree(3);
		root.left = new Tree(1, new Tree(6, new Tree(-5), null), new Tree(7));
		root.right = new Tree(5, new Tree(8), new Tree(9));

		levelOrder(root);

	}

	private static void levelOrder(Tree root) {
		if(root==null)
			return ;
		
		Queue<Tree> queue=new LinkedList<Tree>() ;
		
		queue.add(root);
		while(queue.isEmpty()==false)
		{
			Tree curr=queue.poll();
			System.out.println(" "+curr.data+" ");
			
			if(curr.left!=null)
				queue.add(curr.left);
			if(curr.right!=null)
				queue.add(curr.right);
		}
//			//priority queue
//			queue.add("Amit Sharma");  
//			queue.add("Vijay Raj");  
//			queue.add("JaiShankar");  
//			queue.add("Raj");  
//			System.out.println("head:"+queue.element());  //throws exception if queue is empty unlike peek which returns null
//			System.out.println("PEEK QUEUE ");
//			System.out.println("head:"+queue.peek());  
//			System.out.println("iterating the queue elements:");  
//			Iterator itr=queue.iterator();  
//			while(itr.hasNext()){  
//			System.out.println(itr.next());  
	}
	
}
