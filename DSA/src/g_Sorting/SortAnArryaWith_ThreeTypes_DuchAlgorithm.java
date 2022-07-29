package g_Sorting;

public class SortAnArryaWith_ThreeTypes_DuchAlgorithm {
	
	public static void partitioning(int arr[], int p)
	{
		int l=0, mid=0, h=arr.length-1;
		while(mid<=h)
		{
			if(arr[mid]<p)
			{
				int temp = arr[l];
				arr[l] = arr[mid];
				arr[mid] = temp;
				mid++;
				l++;
			}
			else if(arr[mid]==p)
				mid++;
			else
				{
					int temp = arr[h];
					arr[h] = arr[mid];
					arr[mid] = temp;
					h--;
				}
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,1,2,20,10,20,1}, pivot =2;
		partitioning(arr, pivot);
		for(int print : arr)
			System.out.print(print+" ");

	}

}
