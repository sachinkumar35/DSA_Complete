package f_Searching;

public class BinarySearch {
	public static int binarySearch(int arr[], int key) {
		int low=0, high= arr.length-1;
		while(low<=high)
		{
			int mid= (low+high)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				high=mid-1;
			else 
				low= mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60};
		int x = 50;
		System.out.println(binarySearch(arr, x));
	}

}
