package i_Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency_Efficient2 {

	static void countFreq(int arr[]) {
		Map<Integer,Integer> hmp = new HashMap<Integer,Integer>();
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			if(hmp.containsKey(arr[i])==true)
				hmp.put(arr[i], hmp.get(arr[i])+1);
			else
				hmp.put(arr[i], 1);
		}
		
		for(Map.Entry<Integer,Integer> itr : hmp.entrySet())
			System.out.println(itr.getKey()+" "+itr.getValue());
	}
	public static void main(String[] args) {
		int arr[] = {20,10,30,20,30,50,40,60,40,90,100,50,30,20,10,30,30};
		countFreq(arr);
	}
}
