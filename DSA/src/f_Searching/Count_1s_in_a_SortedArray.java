package f_Searching;

public class Count_1s_in_a_SortedArray {

	public static int FoundOnes(int arr[]) {
		int low=0, high=arr.length-1;
		
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(arr[mid]==0)
				low = mid+1;
			else 
				if(mid==0 || arr[mid-1]!=arr[mid]) {
					return arr.length-mid;
				}
				else
					high = mid-1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0,0,0,0,1,1,1};
		System.out.println(FoundOnes(arr));
	}

}
