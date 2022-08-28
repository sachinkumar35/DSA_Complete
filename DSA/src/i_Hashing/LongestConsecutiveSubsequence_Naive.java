package i_Hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence_Naive {

	static int longestSub(int arr[]) {
		Arrays.sort(arr);
		int res=1, curr = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]+1)
				curr++;
			else if(arr[i]!=arr[i-1])
			{
				res=Math.max(res, curr);
				curr=1;
			}
		}
		return Math.max(res, curr);
	}
	public static void main(String[] args) {
		int arr[] = {1,9,3,4,2,20,5,6,9,10};
		System.out.println(longestSub(arr));
	}

}
