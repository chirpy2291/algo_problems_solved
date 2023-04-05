package dynamic.programming;
import java.util.Arrays;

public class CatalanNumber {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Printing catalan number for " + n);
		findCatalan(n);
	}

	private static void findCatalan(int n) {
		int catalan[] = new int[n + 1];
		catalan[0] = catalan[1] = 1;
		for (int i = 2; i <= n; i++) {
			catalan[i] = 0;
			for (int j = 0; j < i; j++) {
				catalan[i] += catalan[j] * catalan[i - j - 1];
			}
		}
System.out.println(Arrays.toString(catalan));
	}
}

/*
 * Recusrsion
 * 
 * 
 * 
 * class CatalnNumber {
 * 
 * 
 * // A recursive function to find nth catalan number
 * 
 * int catalan(int n) { int res = 0;
 * 
 * // Base case if (n <= 1) { return 1; } for (int i = 0; i < n; i++) { res +=
 * catalan(i) * catalan(n - i - 1); } return res; }
 * 
 * public static void main(String[] args) { CatalnNumber cn = new
 * CatalnNumber(); for (int i = 0; i < 10; i++) { System.out.print(cn.catalan(i)
 * + " "); } } }
 * 
 */