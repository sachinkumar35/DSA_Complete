package g_Sorting;

public class LomutoPartition {
	
	public static void partition(int arr[], int l, int h)
	{
		int pivot = arr[h];
		int i=l-1;
		for(int j=l; j<=h-1; j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int swap = arr[j];
				arr[j] = arr[i];
				arr[i] = swap;
			}
		}
		int swap = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = swap;
	}

	public static void main(String[] args) {
		int arr[] = new int[]{5,13,6,9,12,11,8};
        int n = arr.length;
        partition(arr,0,n-1);
	    for(int x: arr)
	        System.out.print(x+" ");

	}

}
