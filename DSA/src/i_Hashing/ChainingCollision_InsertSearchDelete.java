package i_Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ChainingCollision_InsertSearchDelete {

	int BUCKET;
	ArrayList<LinkedList<Integer>> table;

	ChainingCollision_InsertSearchDelete(int n){
		BUCKET = n;
		table = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<n; i++) {
			table.add(new LinkedList<Integer>());
		}
	}

	void insert(int key) {
		int i = key % BUCKET;
		table.get(i).add(key);
	}

	void remove(int key)
		{
		int i=key%BUCKET;
		table.get(i).remove((Integer)key);
		}
	
	boolean search(int key) {
		int i=key%BUCKET;
		return table.get(i).contains(key);
	}

	public static void main(String[] args) {
		
		ChainingCollision_InsertSearchDelete obj = new ChainingCollision_InsertSearchDelete(7);
		obj.insert(10);
		obj.insert(20);
		obj.insert(15);
		obj.insert(22);
		obj.insert(7);
		System.out.println(obj.search(22));
		obj.remove(15);
		System.out.println(obj.search(15));
		obj.remove(22);
		System.out.println(obj.search(20));
		System.out.println(obj.search(15));
		System.out.println(obj.search(22));
		System.out.println(obj.search(101));
		System.out.println(obj.search(15));

	}

}
