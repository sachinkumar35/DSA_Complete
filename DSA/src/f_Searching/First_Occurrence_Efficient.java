package f_Searching;

public class First_Occurrence_Efficient {

	public static int firstOcc(int arr[], int key) {
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
	public static void main(String[] args) {
		int arr[] = {5,6,7,10,10,10,20,20,20,20,39,50};
		int x = 50;
		System.out.println(firstOcc(arr, x));
	}
}
