package h_Matrix;

public class RotateAMatrixBy90 {
	static int n=4;
	public static void rotate(int arr[][]) {
		int temp[][] = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				temp[n-1-j][i] = arr[i][j];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j] = temp [i][j];
				
		
	}

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
		
		rotate(arr);
		System.out.println("Arter rotate the Matrix....!");
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}

}
