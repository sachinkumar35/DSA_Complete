package e_Arrays;

public class Index_of_Second_Largest_Element {

	public static int SecondLargest(int arr[]) {
		int largest = FirstLargest(arr);
		int res = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1) res = i;
				else if(arr[i]>arr[res]) 
					res = i;
			}
		}
		return res;
	}
	static int FirstLargest(int arr[]) {
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[res]) res = i;
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {20,14,5,35,67};
		System.out.println(SecondLargest(arr));

	}

}
