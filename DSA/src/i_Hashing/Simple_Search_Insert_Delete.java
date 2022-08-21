package i_Hashing;

public class Simple_Search_Insert_Delete {
		
		int[] table = new int[1000];
		void insertInTable(int arr[]) {
			for( int i=0; i<arr.length; i++) {
				table[arr[i]] = 1;
			}
		}
		
		void insert(int i) {
			table[i] = 1; 
		}
		int search(int i) {
			return table[i];
		}
		void delete(int i) {
			table[i] = 0;
		}

	public static void main(String[] args) {
		
		Simple_Search_Insert_Delete obj = new Simple_Search_Insert_Delete();
		
		int arr[] = {101,103,201,202,300,500};
		obj.insertInTable(arr);
		obj.insert(10);
		System.out.println(obj.search(10));
		obj.insert(20);
		obj.insert(10);
		System.out.println(obj.search(10));
		obj.delete(20);
		System.out.println(obj.search(20));
		System.out.println(obj.search(202));

	}

}
