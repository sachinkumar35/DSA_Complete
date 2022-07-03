package f_Searching;

public class Last_Occurrence_SortedArray {

	public static int lastOcc(int arr[], int key) {
		int low =0, high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]>key)
				high = mid-1;
			else if(arr[mid]<key)
				low = mid+1;
			else
			{
				if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
					return mid;
				else
					low = mid-1;
			}
		}
		
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[] = {5,6,7,10,10,10,20,20,20,20,39,50};
		int x = 1;
		System.out.println(lastOcc(arr, x));
	}
}
