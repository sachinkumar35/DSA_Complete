package e_Arrays;

public class Remove_Duplicates_FromSortedArray {
	
	static int remDuplicates(int arr[]) {
		int[] temp = new int[arr.length];
		int res =1;
		temp[0]=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0; i<res; i++) {
			arr[i] = temp[i];
		}
		return res;
		
	}
	public static void main(String[] args) {
		int arr[] = {20,20,20,30,30,30};
		int n = remDuplicates(arr);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
