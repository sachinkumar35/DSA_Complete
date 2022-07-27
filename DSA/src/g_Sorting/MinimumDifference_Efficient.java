package g_Sorting;

import java.util.Arrays;

public class MinimumDifference_Efficient {
	
	public static int minDiff(int arr[])
	{
		int res = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++)
			res = Math.min(res, arr[i]-arr[i-1]);
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {10,5,3,9,1,12};
		System.out.println(minDiff(arr));

	}

}
