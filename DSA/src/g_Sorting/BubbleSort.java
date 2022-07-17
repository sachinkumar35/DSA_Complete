package g_Sorting;

public class BubbleSort {

	public static void bubble(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j] > arr[j+1]) {
					int swap = arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=swap;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,8,20,5};
		bubble(arr);

		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+",");
	}

}
