package i_Hashing;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Efficient2 {
	
	static int intersect(int a[], int b[]) {
		int res = 0;
		Set<Integer> s = new HashSet<>();
		for(int x : a)
			s.add(x);
		
		for(int x : b) {
			if(s.contains(x)) {
				res++;
				s.remove(x);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int a[] = {10,20,10,20,20,30,40,90,60,20};
		int[] b = {20,30,20,20,40,40,50,10};
		
		System.out.println(intersect(a, b));
	}

}
