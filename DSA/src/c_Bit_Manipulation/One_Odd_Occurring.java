package c_Bit_Manipulation;

public class One_Odd_Occurring {

	static int findOdd(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) count++;  			}
			if(count % 2 != 0) return arr[i];
		}
		return 0;
	}
	public static void main(String[] args) {
	
		int arr[] = {4,3,4,4,4,5,5,3,3};
		System.out.println(findOdd(arr));

	}

}
