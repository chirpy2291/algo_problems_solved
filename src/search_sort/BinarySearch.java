package search_sort;

public class BinarySearch {

	// binary search should have arrays sorted

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int l = 0;
		int h = arr.length - 1;
		int element = 7;
		int index = binsearch(arr, l, h, element);
		if (index < 0)
			System.out.println("Not Found");
		else
			System.out.println("Printing index:" + index);

	}

	private static int binsearch(int[] arr, int l, int h, int element) {

		int mid = (l + h) / 2;

		while (l <= h) {

			if (element == arr[mid])
				return mid;
			else {
				if (element > arr[mid]) {
					return binsearch(arr, mid + 1, h, element);
				} else {
					return binsearch(arr, l, mid - 1, element);
				}
			}

		}
		return -1;
	}

}

//O(logn)