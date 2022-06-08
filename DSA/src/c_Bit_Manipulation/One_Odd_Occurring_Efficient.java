package c_Bit_Manipulation;

public class One_Odd_Occurring_Efficient {
	
	static int findOdd(int arr[], int n) {
		int r=0;
		for(int i=0; i<n; i++) {
			r=r^arr[i];
		}
		return r;
	}
	public static void main(String[] args) {
		
		
		int arr[] = {4,3,4,4,4,5,5,3,3}, n=9;
		System.out.println(findOdd(arr, n));
		
	}

}
