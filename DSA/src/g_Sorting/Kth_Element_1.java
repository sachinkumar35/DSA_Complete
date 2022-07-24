package g_Sorting;

import java.util.Arrays;

public class Kth_Element_1 {

	public static int kth(int arr[], int k)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	public static void main(String[] args) {
		int arr[] = {30,20,5,10,8};
		System.out.println(kth(arr, 4));
		
	}
}
