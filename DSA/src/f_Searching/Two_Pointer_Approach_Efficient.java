package f_Searching;

import java.util.Arrays;

public class Two_Pointer_Approach_Efficient {

	public static boolean getPair(int arr[], int x) {
		
//		Arrays.sort(arr);
		
		int left=0, right = arr.length-1;
		while(left<right)
		{
			int res = arr[left]+arr[right];
			if(res == x)
				return true;
			else if(res > x)
				right--;
			else
				left++;
		}
		return false;
	}
	public static void main(String[] args) {
		
		int arr[] = {5,7,10,13,16,18,21,23,24};
//		int arr[] = {4,20,7,3,7,3,24,6,24,55,2,55,7};
		int x = 27;
		System.out.println(getPair(arr, x));
		
//		for(int a : arr)
//			System.out.print(a +" ");
		
	}

}
