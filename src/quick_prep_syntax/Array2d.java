package quick_prep_syntax;

import java.util.Arrays;

public class Array2d {
	
	public static void main(String[] args) {
		
		int[][] str={{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}}; // array constants can only be initialised in variable declaration
		
		//How to traverese through the 2 d array
		
		System.out.println("Number of Rows:--> " +str.length);
		System.out.println("Number of Columns:--> "+str[1].length);
		
		//printing an array real quick-cant print 2d array directly
		System.out.println(Arrays.toString(str[3]));

	}
	

}
