package g_Sorting;

public class SelectionSort_Naive {

	public static void selection(int arr[])
	{
		int temp[] = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			int min_ind = 0;
			for(int j=1; j<arr.length; j++)
				{
					if(arr[j]<arr[min_ind])
						min_ind=j;
				}
			temp[i] = arr[min_ind];
			arr[min_ind] = 1000;
		}
		
		for(int i=0; i<arr.length; i++)
			arr[i] = temp[i];
	}
	public static void main(String[] args) {
		int arr[] = {6,2,6,7,3,1};
		selection(arr);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
	}
}
