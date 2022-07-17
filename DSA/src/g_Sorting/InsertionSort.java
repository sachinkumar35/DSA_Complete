package g_Sorting;

public class InsertionSort {
	
	public static void insertionSort(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int key = arr[i];
			int res = i-1;
			while(res>=0 && arr[res]>key)
			{
				arr[res+1]=arr[res];
				res--;
			}
			arr[res+1]=key;
		}
	}

	public static void main(String[] args) {
		int arr[] = {20,5,40,60,10,30};
		insertionSort(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
