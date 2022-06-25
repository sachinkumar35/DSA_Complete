package e_Arrays;

public class Left_Rotate_an_Array_by_D_Efficient {

	public static void LeftRotate(int arr[], int d) {
		int temp[] = new int[d];
		for(int i=0; i<d; i++)
			temp[i]=arr[i];
		
		for(int i=d; i<arr.length; i++) 
			arr[i-d]=arr[i];
		
		for(int i=0; i<d; i++) 
			arr[arr.length-d+i]=temp[i];
	}
	public static void main(String[] args) {
		int arr[] = {3,5,53,4,34,5,32,12,4,7,9};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
		System.out.println(" |     |     |     |");
		
		LeftRotate(arr, 3);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");

	}

}
