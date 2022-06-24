package e_Arrays;

public class Move_All_Zeros_to_End {

	static void moveAllZeros(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[j]!=0) {
						swap(arr[i], arr[j]);
					}
				}
			}
		}
	}
	static void swap(int arr, int arr2) {
		int temp=arr;
			arr=arr2;
			arr2=temp;
	}
	public static void main(String[] args) {
		int arr[]= {6,0,0,4,6,0,2,9,0};
		moveAllZeros(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
