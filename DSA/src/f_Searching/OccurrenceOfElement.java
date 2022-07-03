package f_Searching;

public class OccurrenceOfElement {
	
	private static int Last_Occurrence_SortedArray(int[] arr, int key) {
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
	
	
	private static int First_Occurrence_Efficient(int[] arr, int key) {
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
				if(mid==0 || arr[mid-1]!=arr[mid])
					return mid;
				else
					high = mid-1;
			}
		}
		return -1;
	}
	
	
	static int Occ(int arr[] , int key) {
		
		int firstOcc = First_Occurrence_Efficient(arr, key);
		if(firstOcc == -1) 
			return 0;
		return (Last_Occurrence_SortedArray(arr, key) - firstOcc + 1);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,6,7,10,10,10,20,20,20,20,20,39,50};
		int x = 20;
		System.out.println(Occ(arr, x));

	}

}
