package i_Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencies_Efficient {

	static void countFreq(int arr[]) {
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int x: arr)
			h.put(x, h.getOrDefault(x, 0)+1);
		for(Map.Entry<Integer,Integer> e: h.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	
	}
	public static void main(String[] args) {
		int arr[] = {20,10,30,20,30,50,40,60,40,90,100,50,30,20,10,30,30};
		countFreq(arr);
	}
}
