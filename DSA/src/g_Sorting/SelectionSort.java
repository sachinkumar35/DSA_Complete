package g_Sorting;

public class SelectionSort {

	public static void selection(int arr[])
	{
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			for(int j=i+1; j<n; j++)
				if(arr[j]<arr[min])
					min = j;
			
			int swap = arr[i];
			arr[i] = arr[min];
			arr[min] = swap;
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,5,8,20,2,18};
		selection(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");

	}

}
