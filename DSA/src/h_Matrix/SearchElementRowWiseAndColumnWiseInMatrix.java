package h_Matrix;

public class SearchElementRowWiseAndColumnWiseInMatrix {
	
	public static void searchEle(int arr[][], int R, int C, int x)
	{
		int i=0, j=C-1;
		while(i<R && j>=0)
		{
			if(arr[i][j]==x) {
				System.out.println("Found at ("+i+","+j+")");
				return;
			}
			else if(arr[i][j]>x)
				j--;
			else
				i++;
		}
		System.out.println("Not Found.....!");
	}

	public static void main(String[] args) {
		int arr[][] = {{10,20,30,40,50},{15,22,34,43,55},{16,23,35,44,56},{17,25,37,45,60}};
		int R=4,C=5;
		int x=9;
		
		System.out.println("-----MATRIX IS-----");
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(arr[i][j]+"   ");
				}
		System.out.println();
		}
		
		System.out.println("Found the element: "+x);
		searchEle(arr, R, C, x);

	}

}
