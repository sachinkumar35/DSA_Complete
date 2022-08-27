package i_Hashing;

public class LongestSubArrayOfGivenSum_Naive {

	static int maxLen(int arr[], int sum) {
		int res=0; 
		for(int i=0; i<arr.length; i++) {
			int carr_sum = 0;
			for(int j=i; j<arr.length; j++) {
				carr_sum += arr[j];
				if(carr_sum == sum)
					res = Math.max(res, j-i+1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] arr = {5,8,-4,-4,9,-2,2};
		int sum =0;
		System.out.println(maxLen(arr, sum));
		

	}

}
