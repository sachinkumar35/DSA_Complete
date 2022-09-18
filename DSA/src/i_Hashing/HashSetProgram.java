package i_Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram{

	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<String>();
		s.add("Sachin");
		s.add("Bhardwaj");
		s.add("Tester");
		System.out.println(s);
		System.out.println(s.contains("Tester"));
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.print(i.next()+" ");
	}

}
