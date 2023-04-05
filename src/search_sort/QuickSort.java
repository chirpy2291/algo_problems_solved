package search_sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {

		int arr[] = { 10, 80, 20, 30, 40, 90, 50 };

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pivot = getPivot(arr, low, high);
			System.out.println(low + " " + pivot + " " + high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}

	}

	private static int getPivot(int[] arr, int low, int high) {

		int i = -1;
		int pivot = arr[high];
		for (int j = 0; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				if (i != j)
					swapElements(arr, i, j);

			}
		}
		System.out.println("last element " + (i + 1) + " " + arr[i + 1] + " " + arr[high]);

		swapElements(arr, (i + 1), high);

		return (i + 1);
	}

	private static void swapElements(int[] arr, int i, int pivot) {
		int temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;

	}
}
