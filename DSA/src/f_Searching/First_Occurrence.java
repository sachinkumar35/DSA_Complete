package f_Searching;

public class First_Occurrence {

	static int firstOcc(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 10,20,20,20,20,39,50};
		int x = 20;
		System.out.println(firstOcc(arr, x));

	}

}
