package c_Bit_Manipulation;

public class FindMissingNumber {

	static int missingNo(int arr[], int n) {
		int total =1;
		for(int i=2; i<=(n+1);i++) {
			total +=i;
			total -=arr[i-2];
		}
		return total;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,1,6};
		System.out.println(missingNo(arr, arr.length));
		
	}

}
