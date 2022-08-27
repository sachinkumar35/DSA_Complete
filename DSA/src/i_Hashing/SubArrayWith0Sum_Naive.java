package i_Hashing;

public class SubArrayWith0Sum_Naive {

	static boolean subArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int sum=0; 
			for( int j=i; j<arr.length; j++) {
				sum +=arr[j];
				if(sum==0)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,4,13,5,-10,5};
		System.out.println(subArray(arr));
		
	}

}
