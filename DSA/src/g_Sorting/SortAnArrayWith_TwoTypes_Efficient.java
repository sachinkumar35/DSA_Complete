package g_Sorting;

public class SortAnArrayWith_TwoTypes_Efficient {

	public static void segregateEvenOdd(int arr[])
	{
		int i=-1, j=arr.length;
		while(true)
		{
			do {
				i++;
			}while(arr[i]%2==0);
			do {
				j--;
			}while(arr[j]%2!=0);
			if(i>=j) return;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {15,14,13,12,21,33,45,46,2};
		segregateEvenOdd(arr);
		for(int print : arr)
			System.out.print(print+" ");
	}
}
