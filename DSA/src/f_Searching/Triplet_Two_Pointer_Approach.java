package f_Searching;

public class Triplet_Two_Pointer_Approach {
	
	public static boolean triplet(int arr[], int x) {
		
		for(int i=0; i<arr.length; i++) {
			if(getPairTwoPointer(arr, i+1, arr.length-1, x-arr[i] ))
				return true;
		}
		return false;
		
	}
	private static boolean getPairTwoPointer(int arr[],int left, int right, int k) {
		
		while(left<right)
		{
			if(arr[left]+arr[right]==k)
				return true;
			else if(arr[left]+arr[right] < k)
				left++;
			else
				right--;
		}
		
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {3,6,8,10,36,39,40,45};
		int x = 60;
		System.out.println(triplet(arr, x));

	}

}
