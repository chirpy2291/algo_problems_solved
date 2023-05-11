package quick_prep_syntax;
import java.util.*;
public class GetOrDefault {
	// Java program to demonstrate
	// getOrDefault(Object key, V defaultValue) method

	

	

		// Main method
		public static void main(String[] args)
		{

			// Create a HashMap and add some values
			HashMap<String, Integer> map
				= new HashMap<>();
			map.put("a", 100);
			map.put("b", 200);
			map.put("c", 300);
			map.put("d", 400);

			// print map details
			System.out.println("HashMap: "
							+ map.toString());

			// provide key whose value has to be obtained
			// and default value for the key. Store the
			// return value in k
			int k = map.getOrDefault("b", 500);

			// print the value of k returned by
			// getOrDefault(Object key, V defaultValue) method
			System.out.println("Returned Value: " + k);
			
			//application : to check if some element is present in map,if not place it
			map.put("a", map.getOrDefault("a", 0)+1);
			map.put("e", map.getOrDefault("e", 0)+1);
			System.out.println("HashMap: "
					+ map.toString());
	}

}
