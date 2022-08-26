package i_Hashing;

import java.util.HashSet;
import java.util.Set;

public class Union_Efficient {

	static int union(int a[], int b[]) {
		Set<Integer> s = new HashSet<>();
		for(int x : a)
			s.add(x);
		for(int y : b)
			s.add(y);
		
		return s.size();
	}
	public static void main(String[] args) {
		int a[] = {10,20,10,20,20,30,40,90,60,20};
		int[] b = {20,30,20,20,40,40,50,10,10};
		
		System.out.println(union(a, b));
	}

}
