package g_Sorting;

public class QuickSort_UsingLomuto {
	
	public static void quickSort(int arr[], int l, int h) {
		if(l<h)
		{
			int p = partition(arr,l,h);
			quickSort(arr, l, p-1);
			quickSort(arr, p+1, h);
		}	
	}
	static int partition(int arr[], int l, int h)
	{
		int p = arr[h];
		int i = l-1;
		for(int j=l; j<=h-1; j++)
		{
			if(arr[j]<p)
			{
				i++;
				int swap = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;
			}
		}
		int swap = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = swap;
		
		return (i+1);
	}
	
	public static void main(String[] args) {
		int arr[] = {8,4,7,9,3,10,5};
		int l=0, h=arr.length;
		
		quickSort(arr, l, h-1);
		
		for(int print : arr)
			System.out.print(print+" ");	
	}
}
