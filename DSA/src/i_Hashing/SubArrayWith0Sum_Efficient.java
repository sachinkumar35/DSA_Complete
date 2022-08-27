package i_Hashing;

import java.util.HashSet;

public class SubArrayWith0Sum_Efficient {

	static boolean subArray(int arr[]) {
		HashSet<Integer> h = new HashSet<>();
		int pre_Sum = 0;
		for(int i=0; i<arr.length; i++) {
			pre_Sum += arr[i];
			if(h.contains(pre_Sum))
				return true;
			if(pre_Sum == 0)
				return true;
			h.add(pre_Sum);
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,4,13,5,-23,5};
		System.out.println(subArray(arr));

	}

}
