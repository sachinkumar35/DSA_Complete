package e_Arrays;

public class Remove_Duplicates_FromSortedArray_Efficient {

	static int remDuplicates(int arr[]) {
		int res =1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[res-1]) {
				System.out.println(arr[res-1]);
				arr[res]=arr[i];
				res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {10,10,10,20,20,20,30,40,40};
		int n = remDuplicates(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
