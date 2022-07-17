package g_Sorting;

import java.util.Arrays;

public class SubArraySort1 {

	public static void main(String[] args) {
		int arr[] = {6,3,67,3,77,34,2,1};
		
		// sort subarray from index 1 to 4, i.e.,
		// only sort subaarray {3,3,67,77} and 
		// keep other elements as it is.
		
		Arrays.sort(arr,1,5);
		
		System.out.println(Arrays.toString(arr));

	}

}
