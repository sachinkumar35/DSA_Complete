package i_Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationOfChaining {
	
	int BUCKET;
	ArrayList<LinkedList<Integer>>table;
	
	ImplementationOfChaining(int b) {
		BUCKET = b;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<b; i++)
			table.add(new LinkedList<Integer>());
	}
	
	void insert(int key) {
		int i = key%BUCKET;
		table.get(i).add(key);
	}
	
	void remove(int key) {
		int i = key%BUCKET;
		table.get(i).remove((Integer)key);
	}
	
	boolean search(int key) {
		int i = key%BUCKET;
		return table.get(i).contains(key);
	}

	public static void main(String[] args) {

		ImplementationOfChaining imp = new ImplementationOfChaining(7);
		imp.insert(10);
		imp.insert(20);
		imp.insert(80);
		imp.insert(25);
		System.out.println(imp.search(20));
		imp.insert(20);
		imp.remove(20);
		System.out.println(imp.search(20));
		imp.remove(20);
		System.out.println(imp.search(20));

		

	}

}
