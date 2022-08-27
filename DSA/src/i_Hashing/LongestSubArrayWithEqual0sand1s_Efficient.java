package i_Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqual0sand1s_Efficient {

	static int longestSub(int arr[]) {
		Map<Integer, Integer> hm = new HashMap<>();
		int sum = 0, maxLen = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == 0)
				arr[i] = -1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0)
				maxLen = i + 1;
			if (hm.containsKey(sum + arr.length) == true)
				maxLen = Math.max(maxLen, i - hm.get(sum + arr.length));

			else
				hm.put(sum + arr.length, i);

		}
		return maxLen;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 1, 0, 1 };
		System.out.println(longestSub(arr));

	}

}
