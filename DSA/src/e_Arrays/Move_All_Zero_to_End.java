package e_Arrays;

public class Move_All_Zero_to_End {
	static void MoveZeros(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
		while(count<arr.length) 
			arr[count++]=0;
		}
	
	public static void main(String[] args) {
		int arr[]= {6,0,0,4,6,0,2,9,0};
		MoveZeros(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
