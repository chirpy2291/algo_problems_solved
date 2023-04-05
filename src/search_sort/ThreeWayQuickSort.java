package search_sort;

import java.util.Arrays;

public class ThreeWayQuickSort {
	// Using the Dutch National Flag Algo
	public static void main(String[] args) {

		int a[] = { 0, 2, 2, 1, 1, 0, 2 };

		quickSort(a);
		System.out.println(Arrays.toString(a));

	}

	private static void quickSort(int[] a) {

		int low = 0;
		int high = a.length - 1;
		int mid = 0;

		while (mid <= high) {
			System.out.println(Arrays.toString(a));

			switch (a[mid]) {
			case 0:
				swapElements(a, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swapElements(a, high, mid);
				high--;
				break;
			}
		}

	}

	private static void swapElements(int[] arr, int i, int pivot) {
		int temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;

	}
}
