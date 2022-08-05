package h_Matrix;

public class TransposeMatrix_Naive {
	static int n=4;
	public static void transpose(int arr[][])
	{
		int temp[][] = new int[n][n];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				temp[i][j]=arr[j][i];
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				arr[i][j]=temp[i][j];
		
	}

	public static void main(String[] args) {
		int arr[][] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
		transpose(arr);
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
}
