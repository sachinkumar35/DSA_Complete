package i_Hashing;

import java.util.HashSet;
import java.util.Set;

public class PairsForGivenSum_Efficient {
	
	static boolean pairs(int arr[], int sum) {
		Set<Integer> s = new HashSet<>();
		for(int x : arr) {
			if(s.contains(sum-x))
				return true;
			else 
				s.add(x);
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {3,2,8,15,-8};
		int sum = 19;
		System.out.println(pairs(arr, sum));

	}

}
