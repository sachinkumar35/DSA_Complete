package g_Sorting;

public class QuickSort_usingHoares {
	
	public static void quickSort(int arr[], int l, int h)
	{
		if(l<h)
		{
			int p = partition(arr, l, h);
			quickSort(arr, l, p);
			quickSort(arr, p+1, h);
		}
	}
	
	private static int partition(int arr[], int l, int h)
	{
		int p = arr[l];
		int i=l-1, j=h+1;
		while(true)
		{
			do {
				i++;
			}while(arr[i]<p);
			do {
				j--;
			}while(arr[j]>p);
			
			if(i>=j) return j;
			
			int swap = arr[i];
			arr[i] = arr[j];
			arr[j] = swap;	
		}
	}

	public static void main(String[] args) {
		int arr[] = {8,4,7,9,3,10,5};
		int l=0, h=arr.length;
		
		quickSort(arr, l, h-1);
		
		for(int print : arr)
			System.out.print(print+" ");	
	}
}
