package e_Arrays;

public class Consecutive_of_1_Efficient {
	public static int Cons(int arr[]) {
		int count=0, result=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) count++;
			else count=0;
			if(result<count) result = count;
		}
		return result;
	}
	public static void main(String[] args) {
		int arr[]= {1,0,1,1,1,1,0,1,1};
		System.out.println(Cons(arr));

	}

}
