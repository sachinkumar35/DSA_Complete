package e_Arrays;

public class Index_Of_Largest_Element {

	static int FindL(int arr[]) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			boolean flag = true;
			for(int j=0; j<n; j++) {
				if(arr[j]>arr[i]) {
					flag = false;
					break;
				}
			}
			
			if(flag==true) return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {3,66,85,34,85,23,12};
		System.out.println(FindL(arr));

	}

}
