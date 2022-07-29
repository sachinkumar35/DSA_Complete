package g_Sorting;

public class SortAnArrayWith_TwoTypes_Naive {
	
	public static void segregateEvenOdd(int arr[])
	{
		int temp[] = new int[arr.length], j=0;
		for(int i=0; i<arr.length; i++)
			if(arr[i]%2==0)
				temp[j++] = arr[i];
		for(int i=0; i<arr.length; i++)
			if(arr[i]%2!=0)
				temp[j++] = arr[i];
		for(int i=0; i<arr.length; i++)
			arr[i] = temp[i];
			
	}

	public static void main(String[] args) {
		int arr[] = {15,14,13,12,21,33,45,46,2};
		segregateEvenOdd(arr);
		for(int print : arr)
			System.out.print(print+" ");
	}

}
