package e_Arrays;

public class Search_X_Element {

	static int searchX(int arr[], int x, int i) {
		if(arr[i]==x) {
			return i;
		}
		
		return searchX(arr, x, i+1 );
		
	}
	public static void main(String[] args) {
		int arr[] = {5,20,15,7,4};
		System.out.println(searchX(arr, 15, 0));

	}

}
