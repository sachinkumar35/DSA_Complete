package e_Arrays;

public class Move_All_Zeros_to_End_Efficient {

	static void moveAllZeros(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int swap = arr[i];
				arr[i]=arr[count];
				arr[count]=swap;
				count++;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {6,0,0,4,6,0,2,9,0};
		moveAllZeros(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
