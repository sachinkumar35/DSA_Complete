package e_Arrays;

public class Reverse_An_Array {
	static void rev(int arr[]) {
		int low=0, high=arr.length-1;
		while(low<high) {
			int swap = arr[low];
			arr[low] = arr[high];
			arr[high] = swap;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		
		int arr[]= {4,5,2,6,3,8};
		System.out.println("Before Reverse..!");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		rev(arr);
		
		System.out.println("After Reverse..!");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
