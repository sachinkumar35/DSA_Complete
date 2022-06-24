package e_Arrays;

public class Check_Array_Is_Sorted {
	static boolean sorted(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[i]) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,21,22,25,30};
//		int arr[] = {200};
	
		System.out.println(sorted(arr));

	}

}
