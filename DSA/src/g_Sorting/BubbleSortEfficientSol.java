package g_Sorting;

public class BubbleSortEfficientSol {

	public static void bubbleSort(int arr[])
	{
		int n = arr.length;
		boolean swapped; 
		for(int i=0; i<n; i++) {
			swapped = false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
					
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {2,10,3,4,6,7};
		bubbleSort(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
