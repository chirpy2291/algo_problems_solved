package dynamic.programming;
import java.util.Arrays;
import java.util.Scanner;

public class Fibbonacci {
	static int n = new Scanner(System.in).nextInt();
	static int memo[] = new int[n + 1];

	public static void main(String[] args) {

		System.out.println(fibo(n));
	}

	private static int fibo(int i) {

		if (i <= 1) {
			return i;
		}

		else if (memo[i] != 0) {
			return memo[i];

		} else {
				memo[i]=fibo(i-1)+fibo(i-2);

		}

		return memo[i];

	}
}

