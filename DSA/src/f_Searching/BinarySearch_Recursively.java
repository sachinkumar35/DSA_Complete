package f_Searching;

public class BinarySearch_Recursively {

	public static int binarySearch(int arr[], int key, int low, int high) {
		
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(arr[mid]==key) return mid;
		if(arr[mid]>key) 
			return binarySearch(arr, key, low, mid-1);
			
		return binarySearch(arr, key, mid+1, high);
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int x = 15;
		System.out.println(binarySearch(arr, x, 0, arr.length-1));

	}

}
