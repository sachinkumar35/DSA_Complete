package e_Arrays;

public class Leaders_in_an_Array_Efficient {

	static void leader(int arr[]) {
		int currChar=arr[arr.length-1];
		System.out.print(currChar+" ");
		for(int i=arr.length-2; i>=0; i--) {
			if(currChar<arr[i])
			{
				currChar=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {6,34,2,34,23,12,10,6,7,5};
		leader(arr);
	}

}
