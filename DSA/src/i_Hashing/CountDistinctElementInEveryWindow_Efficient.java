package i_Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementInEveryWindow_Efficient {
	
	static void PrintDistinct(int arr[], int k) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<k; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		System.out.print(hm.size()+" ");
		for(int i=k; i<arr.length; i++) {
			hm.put(arr[i-k], hm.get(arr[i-k])-1);
			if(hm.get(arr[i-k])==0)
				hm.remove(arr[i-k]);
			hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
			System.out.print(hm.size()+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,20,20,10,30,40,10};
		int k = 4;
		PrintDistinct(arr, k);

	}

}
