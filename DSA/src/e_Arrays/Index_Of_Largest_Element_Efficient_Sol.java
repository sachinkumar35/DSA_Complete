package e_Arrays;

public class Index_Of_Largest_Element_Efficient_Sol {

	public static int FindLargestIndex(int arr[]) {
		int res = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[res])
				res=i;
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {100,3,6,22,4,76,80,4,34,166};
		System.out.println(FindLargestIndex(arr));
	}
}
