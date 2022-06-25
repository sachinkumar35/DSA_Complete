package e_Arrays;

public class Frequencies_in_SortedArray {

	static void Frequencies(int arr[]) {
		int count =0, x=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=x) {
				for(int j=0; j<arr.length; j++) {
					if(arr[i]==arr[j])
					count++;
				}
				System.out.println(arr[i]+" = "+count);
				count=0;
			}
			x=arr[i];
		}
	}
	public static void main(String[] args) {
		int arr[] = {20,20,20,30,30,50,50,50,60};
		Frequencies(arr);
	}

}
