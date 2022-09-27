package e_Arrays;

public class Frequencies_in_SortedArray_EFF {
	static void Frequencies(int[] arr) {
		int count=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1])
				count++;
			else {
				System.out.println(arr[i-1]+" : "+count);
				count=1;
			}
		}
		System.out.println(arr[arr.length-1]+" : "+count);
	}
	public static void main(String[] args) {
		int arr[] = {20,20,20,30,30,50,50,50,60};
		Frequencies(arr);
	}
}
