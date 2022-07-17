package g_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(50);
		list.add(20);
		
//	to sort the list in increasing order
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println();
//	in decreasing order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	}

}
