package h_Matrix;

public class SearchElementInMatrix {
	
	public static void searchEle(int arr[][], int R, int C, int x)
	{
		for(int i=0; i<R; i++)
			for(int j=0; j<C; j++)
				if(arr[i][j] == x)
				{
					System.out.print("Found at ("+i+","+j+")");
					return;
				}
		System.out.println("Not Found....!");
	}

	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		int R=5,C=4;
		int x=19;
		
		searchEle(arr, R, C, x);

	}

}
