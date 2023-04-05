package search_sort;

import java.util.Arrays;

public class BubbleSort {
	// Bubble sorting with the flag
		public static void main(String[] args) {

			int arr[] = { 1,2,3,4,5 };
			int n = arr.length, temp = 0;
			int flag = 1;
			for (int j = 0; j < n && flag==1; j++) {
				flag = 0;

				for (int i = 0; i < n - j - 1 ; i++)

				{
					System.out.println(i + " " + (i + 1));
					if (arr[i] > arr[i + 1]) {
						temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						flag = 1;
					}
				}
				System.out.println(Arrays.toString(arr));
			}
			//System.out.println(Arrays.toString(arr));
		}
}
//(n^2)