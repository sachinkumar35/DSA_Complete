package h_Matrix;

public class Passing2DArrayAsAnArgument {

	public static void print(int arr[][]) {
		for(int i=0; i<arr.length; i++)
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
	}
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6}};
		print(arr);

	}

}
