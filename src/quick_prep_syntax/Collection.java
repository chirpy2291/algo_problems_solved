package quick_prep_syntax;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class Collection {

	public static void main(String[] args) {

		// ************** Map demo  ****************
		
		
		
		
		
		

		// ***********Set List demo***************

		/*
		 * The asList() method of java.util.Arrays class is used to return a fixed-size
		 * list backed by the specified array. This method acts as a bridge between
		 * array-based and collection-based APIs, in combination with
		 * Collection.toArray(). The returned list is serializable and implements
		 * RandomAccess.
		 * 
		 */

		try {
			Integer a1[] = new Integer[] { 10, 20, 30, 40 };

			// Getting the list view of Array
			List<Integer> list1 = Arrays.asList(a1);

			// Adding another int to the list
			// As Arrays.asList() returns fixed size
			// list, we'll get
			// java.lang.UnsupportedOperationException

			// list1.add(50);

			System.out.println("The list is: " + list1);
		} catch (NullPointerException e) {

			System.out.println("Exception thrown : " + e);
		}

		/*
		 * 
		 * The List interface provides a way to store the ordered collection. It is a
		 * child interface of Collection. It is an ordered collection of objects in
		 * which duplicate values can be stored. Since List preserves the insertion
		 * order, it allows positional access and insertion of elements. Now here we are
		 * given a List be it any LinkedList or ArrayList of strings, our motive is to
		 * convert this list to an array of strings in java using different methods.
		 * 
		 */
		List<String> list = new LinkedList<String>();

		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("Practice");

		int n = list.size();

		// Converting List to array via scope resolution
		// operator using streams
		String[] arr = list.stream().toArray(String[]::new);
		// or use list.toArray();
		for (String x : arr)
			System.out.print(x + " ");

		String[] arr1 = list.toArray(new String[0]);
		System.out.print(":: ");

		for (String x : arr1)
			System.out.print(x + " ");
		
		
		
		
		

		// **************** StackQueue ****************

		Stack<Integer> stackTest = new Stack<Integer>();
		stackTest.push(1);
		stackTest.push(4);
		System.out.println("1-->" + stackTest);
		System.out.println(stackTest.pop());
		// System.out.println(stackTest.pop());
		System.out.println(stackTest);
		System.out.println("PEEK STACK " + stackTest.peek()); // peek looks at the top item without removing it
		System.out.println(stackTest); // Empty Stack Exception
		stackTest.push(4);
		stackTest.push(5);
		System.out.println(stackTest);

		// Queue<Integer> q=new LinkedList<Integer>() ; can be used this way

		// priority queue
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:" + queue.element()); // throws exception if queue is empty unlike peek which returns
														// null
		System.out.println("PEEK QUEUE ");
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}