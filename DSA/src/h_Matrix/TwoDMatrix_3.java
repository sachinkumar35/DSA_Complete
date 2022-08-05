package h_Matrix;

import java.util.Scanner;

public class TwoDMatrix_3 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int m = 3;
		int arr[][] = new int[m][];
		
		for(int i=0; i<arr.length; i++)
			{
				arr[i]= new int[i+1];
				for(int j=0; j<arr[i].length; j++)
				{
					arr[i][j] = sc.nextInt();
//					System.out.print(arr[i][j]+" ");					
				}
				System.out.println();
			}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		
	}
}
