package e_Arrays;

public class Left_Rotate_an_Array_By_D_MoreEfficient {

	static void LeftRotate(int arr[], int d) {
		rev(arr, 0, d-1);
		rev(arr, d, arr.length-1);
		rev(arr, 0, arr.length-1);
	}
	static void rev(int arr[], int low, int high) {
		while(low<high) {
			int swap = arr[low];
			arr[low] = arr[high];
			arr[high] = swap;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,5,53,4,34,5,32,12,4,7,9};
		LeftRotate(arr, 2);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");

	}

}
