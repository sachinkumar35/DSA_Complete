package e_Arrays;

public class Index_of_Second_Largest_Ele_Efficient_Sol {

	static int secondLargestElementOfIndex(int arr[]) {
		int res=-1, largest = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest = i;
			}
			else if(arr[i]!=arr[largest]) {
				if(res==-1 || arr[i]>arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {

		int arr[] = {20,10,5,16};
		System.out.println(secondLargestElementOfIndex(arr));
	}

}
