package i_Hashing;

public class LongestCommonSubArrayWithSameSumInBinaryArray_Naive {

	static int longestCommonSum(int arr1[], int arr2[]) {
		int res =0;
		for(int i=0; i<arr1.length; i++) {
			int sum1=0, sum2=0;
			for(int j=i; j<arr1.length; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];
				if(sum1==sum2)
					res = Math.max(res, j-i+1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr1[] = {0,1,0,1,1,1,1};
		int arr2[] = {1,1,1,1,1,0,1};
		System.out.println(longestCommonSum(arr1, arr2));
	}

}
