package e_Arrays;

public class Left_Rotate_an_Array_By_D {

	static void LeftRotate(int arr[], int d) {
		for(int i=0; i<d; i++)
			leftRotateOne(arr);
	}
	static void leftRotateOne(int arr[]) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++)
			arr[i-1]=arr[i];
		arr[arr.length-1]=temp;
	}
	public static void main(String[] args) {
		int arr[] = {5,3,7,3,34,23,5,75,8};
		int d = 2;
		
		System.out.println("Before Rotate...!");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

		System.out.println();
		LeftRotate(arr,d);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
