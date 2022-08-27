package i_Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairsForGivenSum_Efficient2 {
		
		static boolean pairs(int arr[], int sum) {
			Set<Integer> s = new HashSet<>();
			for(int x : arr)
				s.add(x);
			for(int x : arr) {
				if(s.contains(sum-x))
					return true;
			}
			return false;
		}

		public static void main(String[] args) {
			int arr[] = {3,2,8,15,-8};
			int sum = 17;
			System.out.println(pairs(arr, sum));

		}

}
