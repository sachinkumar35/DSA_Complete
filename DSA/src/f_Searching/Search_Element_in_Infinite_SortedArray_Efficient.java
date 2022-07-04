package f_Searching;

public class Search_Element_in_Infinite_SortedArray_Efficient {

	private static int binarySearch(int arr[], int x, int low, int high) {
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				high=mid-1;
			else
				low = mid+1;
		}
		return -1;
	}
	public static int search(int arr[], int x) {
		if(arr[0]==x) return 0;
		int i=1;
		while(arr[i]<x) {
			i=i*2;
		}
		if(arr[i]==x) return i;
		return binarySearch(arr, x, i/2+1, i);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,12,13,23,34,54,56,67,89,100,199,200,288,387};
		int x = 67;
		System.out.println(search(arr, x));

	}

}
