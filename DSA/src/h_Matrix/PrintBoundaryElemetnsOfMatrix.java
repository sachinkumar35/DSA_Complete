package h_Matrix;

public class PrintBoundaryElemetnsOfMatrix {
	static int R=4, C=4;
	public static void BoundaryPattern(int arr[][]) {
		if(R==1)
			for(int i=0; i<C; i++)
				System.out.print(arr[0][i]+" ");
		else if(C==1)
			for(int i=0; i<R; i++)
				System.out.print(arr[i][0]+" ");
		
		else 
		{
			for(int i=0; i<C; i++)
				System.out.print(arr[0][i]+" ");
			for(int i=1; i<R; i++)
				System.out.print(arr[i][C-1]+" ");
			for(int i=C-2; i>=0; i--)
				System.out.print(arr[R-1][i]+" ");
			for(int i=R-2; i>=1; i--)
				System.out.print(arr[i][0]+" ");
		}
		
	}

	public static void main(String[] args) {
		int arr[][] =  {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
//		int arr[][] = {{1,2,3}};
		BoundaryPattern(arr);
		
		}
}
