package f_Searching;

public class First_Occurrence_Efficient_Recursive {

	public static int firstOcc(int arr[], int key, int low, int high) {
		if(low > high) return -1;
		
		int mid = (low+high)/2;
		if(key>arr[mid])
			return firstOcc(arr, key, mid+1, high);
		else if(key<arr[mid])
			return firstOcc(arr, key, low, mid-1);
		else
		{
			if(mid==0 || arr[mid-1]!=arr[mid])
				return mid;
			else 
				return firstOcc(arr, key, low, mid-1);
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,5,10,10,20,20,20,20,39,50};
		int x = 15;
		System.out.println(firstOcc(arr, x, 0, arr.length-1));

	}

}
