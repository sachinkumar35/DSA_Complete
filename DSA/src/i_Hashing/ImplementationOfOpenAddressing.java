package i_Hashing;

public class ImplementationOfOpenAddressing {

	int[] arr;
	int cap, size;
	public ImplementationOfOpenAddressing(int c) {
		cap = c;
		size = 0;
		arr = new int[cap];
		for(int i=0; i<cap; i++) {
			arr[i]=-1;
		}
	}
	int hash(int key) {
		return key%cap;
	}
	
	boolean Search(int key) {
		int h = hash(key);
		int i=h;
		while(arr[i]!=-1) {
			if(arr[i]==key)
				return true;
			i=(i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
		
	}
	
	boolean insert(int key) {
		if(size == cap)
			return false;
		int i = hash(key);
		while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
			i=(i+1)%cap;
		if(arr[i]==key)
			return false;
		else {
			arr[i] = key;
			size++;
			return true;
		}
	}
	
	boolean remove(int key) {
		int h = hash(key);
		int i=h;
		while(arr[i]!=-1)
		{
			if(arr[i]==key) 
			{
				arr[i]=-2;
				return true;
			}
		i=(i+1)%cap;
		if(i==h)
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		ImplementationOfOpenAddressing imp = new ImplementationOfOpenAddressing(7);
		
		System.out.println("insert : "+imp.insert(10));
		System.out.println("insert : "+imp.insert(15));
		System.out.println("insert : "+imp.insert(20));
		System.out.println("search : "+imp.Search(15));
		System.out.println("remove : "+imp.remove(15));
		System.out.println("search : "+imp.Search(15));
		
	}

}
