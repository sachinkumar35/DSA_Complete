package h_Matrix;

import java.util.Scanner;

public class TwoDMatrix_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int arr[][] = new int[x][y];
//		int arr[][] = {{1,2,3,4},{5,6,7}};
		
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<arr[i].length/* y */; j++)
				{	arr[i][j]= sc.nextInt();
//					System.out.print(arr[i][j]+" ");
				}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			 
			for(int j=0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.println(arr[1][1]);
	}
}
