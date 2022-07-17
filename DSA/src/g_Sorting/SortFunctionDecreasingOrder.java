package g_Sorting;

import java.util.Arrays;
import java.util.Collections;

public class SortFunctionDecreasingOrder {

	public static void main(String[] args) {
		Integer arr[] = {5,20,5,2,1,3,4};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

	}

}
