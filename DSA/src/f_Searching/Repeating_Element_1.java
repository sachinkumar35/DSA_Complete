package f_Searching;

import java.util.Arrays;

public class Repeating_Element_1 {
	public static int repeat(int arr[]) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) 
				if(arr[i]==arr[i+1])
					return arr[i];
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {0,2,1,3,2,4};
		System.out.println(repeat(arr));

	}

}
