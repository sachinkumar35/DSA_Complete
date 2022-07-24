package g_Sorting;

public class KthElement_2 {
	
	public static int kth(int arr[], int k)
	{
		int l=0, h= arr.length-1;
		while(l<=h)
		{
			int p = partitionLomuto(arr, l, h);
			
			if(k-1 == p) return arr[p];
			else if(k-1<p) h=p-1;
			else l=p+1;
		}
		return -1;
	}
	private static int partitionLomuto(int arr[], int l, int h)
	{
		int i=l-1;
		int p = arr[h];
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
		
		return i+1;
	}

	public static void main(String[] args) {
		int arr[] = {30,20,5,10,8};
		System.out.println(kth(arr, 5));
		
	}
}
