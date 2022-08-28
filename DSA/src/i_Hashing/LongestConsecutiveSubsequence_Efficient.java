package i_Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence_Efficient {

	static int longestSub(int arr[]) {
		Set<Integer> s = new HashSet<>();
		for(int x : arr) {
			s.add(x);
		}
		int res = 1;
		for(Integer x : s) {
			if(s.contains(x-1)== false)
			{
				int curr = 1;
				while(s.contains(x+curr))
					curr++;
				res = Math.max(res, curr);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {1,9,3,4,2,20,5,6,9,10};
		System.out.println(longestSub(arr));
	}
}
