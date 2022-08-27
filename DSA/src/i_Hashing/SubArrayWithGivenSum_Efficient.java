package i_Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum_Efficient {
	
	static boolean subArray(int arr[], int sum) {
		HashSet<Integer> h = new HashSet<>();
		int pre_sum = 0;
		for(int x : arr) {
			pre_sum += x;
			if(h.contains(pre_sum-sum)) return true;
			if(pre_sum == sum) return true;
			h.add(pre_sum);
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {5,8,6,13,3,-1};
		int sum=22;
		System.out.println(subArray(arr, sum));
	}

}
