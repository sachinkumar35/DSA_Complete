package e_Arrays;

public class Check_Array_Is_Sorted_Efficient_Sol {
	static boolean sorted(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1]>arr[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,21,22,25,30};
//		int arr[] = {200};
	
		System.out.println(sorted(arr));

	}

}
