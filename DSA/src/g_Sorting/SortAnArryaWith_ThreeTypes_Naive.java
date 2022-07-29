package g_Sorting;

public class SortAnArryaWith_ThreeTypes_Naive {
	
	public static void partitioning(int arr[], int p)
	{
		int[] temp = new int[arr.length];
		int k = 0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]<p)
				temp[k++] = arr[i];
		for(int i=0; i<arr.length; i++)
			if(arr[i] == p)
				temp[k++] = arr[i];
		for(int i=0; i<arr.length; i++)
			if(arr[i]>p)
				temp[k++] = arr[i];
		for(int i=0; i<arr.length; i++)
			arr[i] = temp[i];
	}

	public static void main(String[] args) {
		int arr[] = {2,1,2,20,10,20,1}, pivot =2;
		partitioning(arr, pivot);
		for(int print : arr)
			System.out.print(print+" ");
		
		

	}

}
