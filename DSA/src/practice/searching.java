package practice;

public class searching {
		static int searching(int arr[], int x) {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==x)
					return i;
			}
			return -1;
		}
	public static void main(String[] args) {
		 int arr[] = {5,2,6,3,7,3,5,245};
		 System.out.println(searching(arr, 6));

	}

}
