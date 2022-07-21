package g_Sorting;

public class MergeSort {

	public static void mergeFunction(int arr[], int l, int m, int h)
	{
		int n1 = m-l+1, n2 = h-m;
		int left[] = new int[n1], right[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			left[i] = arr[i+l];
		for(int i=0; i<n2; i++)
			right[i] = arr[m+i+1];
		
		int i=0, j=0, k=l;
		
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		while(i<n1)
			arr[k++] = left[i++];
		while(j<n2)
			arr[k++] = right[j++];
	}
	
	public static void mergeSort(int arr[], int l, int r)
	{
		if(r>l)
		{
			int mid = l+(r-l)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			mergeFunction(arr, l, mid, r);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {38,27,43,3,9,82,10};
		mergeSort(arr, 0, arr.length-1);

		for(int x : arr)
			System.out.print(x+" ");
	}
}
