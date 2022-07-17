package g_Sorting;

import java.util.Arrays;

public class Merge_mergeTwoSortedArray1 {

	public static void merge(int a[], int b[]) {
		
		int m = a.length;
		int n = b.length;
		int c[] = new int[m+n];
		
		for(int i=0; i<m; i++)
			c[i]=a[i];
		for(int i=0; i<n; i++)
			c[m+i]=b[i];
		
		Arrays.sort(c);
		
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+ " ");
	}
	public static void main(String[] args) {
		int arr1[] = {10,15,20};
		int arr2[] = {5,6,6,15};
		
		merge(arr1, arr2);
	}

}
