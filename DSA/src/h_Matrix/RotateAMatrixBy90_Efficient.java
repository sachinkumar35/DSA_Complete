package h_Matrix;

public class RotateAMatrixBy90_Efficient {
	static int n=4;
	
//	private static void transpose(int arr[][]) {
//		for(int i=0; i<n; i++)
//			for(int j=i+1; j<n; j++)
//			{
//				int swap = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = swap;
//			}
//	}
//	
//	public static void rotate(int arr[][]) {
//		 
//		transpose(arr);
//		
////		reverse the matrix by column
//		
//		for(int i=0; i<n; i++) {
//			int low=0, high=n-1; 
//			while(low<high) {
//				int swap = arr[low][i];
//				arr[low][i] = arr[high][i];
//				arr[high][i] = swap;
//			}
//		}
//		
//	}
	
	

	public static void main(String[] args) {
		int arr[][] =  {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		
		System.out.println("Before rotate the matrix");
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
			{
				int swap = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = swap;
			}
		for(int i=0; i<n; i++) {
			int low=0, high=n-1; 
			while(low<high) {
				int swap = arr[low][i];
				arr[low][i] = arr[high][i];
				arr[high][i] = swap;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
