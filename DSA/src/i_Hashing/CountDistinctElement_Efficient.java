package i_Hashing;

import java.util.HashSet;

public class CountDistinctElement_Efficient {

	static int CountDistinct(int arr[]) {
		HashSet<Integer> s = new HashSet<>();
		for(int i=0; i<arr.length; i++)
			s.add(arr[i]);
		System.out.println(s);
		return s.size();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,10,20,30,50,50,30,10,60,90,90,60,10,70,10};
		System.out.println(CountDistinct(arr));

	}

}
