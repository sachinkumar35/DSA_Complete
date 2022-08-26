package i_Hashing;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Efficient {
	
	static int intersect(int a[], int[] b) {
		int res = 0;
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		for(int insertA : a)
			s1.add(insertA);
		
		for(int insertB : b)
			s2.add(insertB);
		
		for(int x : s2)
			if(s1.contains(x))
				res++;

		return res;
	}

	public static void main(String[] args) {
		int a[] = {10,20,10,20,20,30,40,90,60,20};
		int[] b = {20,30,20,20,40,40,50,10};
		
		System.out.println(intersect(a, b));

	}

}
