package h_Matrix;

public class TransposeMatrix_Efficient {
	static int n=4;
	public static void transpose(int arr[][])
	{
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
			{
				int swap = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = swap;
			}
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
