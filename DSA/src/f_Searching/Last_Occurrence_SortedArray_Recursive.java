package f_Searching;

public class Last_Occurrence_SortedArray_Recursive {
	
	public static int lastOcc(int arr[], int key, int low, int high) {
		if(low > high) return -1;
		
		int mid = (low+high)/2;
		if(key>arr[mid])
			return lastOcc(arr, key, mid+1, high);
		else if(key<arr[mid])
			return lastOcc(arr, key, low, mid-1);
		else
		{
			if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
				return mid;
			else 
				return lastOcc(arr, key, mid+1, high);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,5,10,10,20,20,20,20,39,50};
		int x = 20;
		System.out.println(lastOcc(arr, x, 0, arr.length-1));

	}

}