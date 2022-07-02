package practice;

public class Equlibrium_In_Array {
	
	// PANDING.................
	
	static int equl(int arr[]) {
		int n=arr.length;
		 int tsum=0, sum=0;
	       for(int i=0; i<n; i++){
	           tsum=+arr[i];
	       }
	       for(int i=0; i<n; i++){
	           if(sum == (tsum-sum-arr[i])) return i+1;
	         sum =sum+arr[i];
	       }
	       return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,3,5,2,2};
//		int arr[] = {20,17,42,25,32,32,30,32,37,9,2,33,31,17,14,40,9,12,36,21,8,33,6,6,10,37,12,26,21,3};
		System.out.println(equl(arr));

	}

}
