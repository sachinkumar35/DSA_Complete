package e_Arrays;

public class Search_X_Element1 {

	public static int searchX(int arr[],int n, int x) {
		for(int i=0; i<n; i++)
			if(arr[i]==x) return i;
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {15,4,30,7,4};
		System.out.println(searchX(arr, 5, 4));

	}

}
