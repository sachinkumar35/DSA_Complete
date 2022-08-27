package i_Hashing;

import java.util.HashMap;

public class LongestCommonSubArrayWithSameSumInBinaryArray_Efficient {

	static int longestCommonSum(int arr1[], int arr2[]) {
		int temp[] = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			temp[i] = arr1[i] - arr2[i];
		}
		HashMap<Integer,Integer> hm = new HashMap<>();
		int sum=0, max_len=0;
		for(int i=0; i<arr1.length; i++) {
			sum += temp[i];
			if(sum==0)
				max_len = i+1;
			if(hm.containsKey(sum))
				max_len = Math.max(max_len, i-hm.get(sum));
			else
				hm.put(sum, i);
		}
		return max_len;
	}
	public static void main(String[] args) {
		int arr1[] = {0,1,0,1,1,1,1};
		int arr2[] = {1,1,1,1,1,0,1};
		System.out.println(longestCommonSum(arr1, arr2));
	}

}
