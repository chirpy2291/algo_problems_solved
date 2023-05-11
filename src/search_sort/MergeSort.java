 package search_sort;

import java.util.Arrays;

/*
  * Pros:
  * 1)suitable for very large dataset
  * 2)stable
  * 3)extrernal sorting
  * 4)suitable for merging upon Linked List
  * 
  * Con:
  * 1)for small dataset its slower than insertion sort although inst. sort takes n^2
  * 2)extra space-n
  * 3)recursive -uses stack of size height of tree-log n.so total space (n+logn)
  */
public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {1,4,6,-5,0,10};
		callMergerSort(0,arr.length-1,arr);
		System.out.print(Arrays.toString(arr));
		
		
		
	}

	private static void callMergerSort(int low, int high, int[] arr) {
		
		if(low < high)
		{
			int mid=(low+high)/2;
			callMergerSort(low,mid,arr);
			callMergerSort(mid+1,high,arr);
			merge(low,mid,high,arr);
		}
		
	}

	private static void merge(int l, int m, int r, int[] arr) {
		//logic to merge
		 // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
	}
}
