package g_Sorting;

public class CycleSort {
	
	public static void cycleSort(int arr[])
	{
		for(int c=0; c<arr.length; c++)
		{
			int item = arr[c];
			int pos = c;
			
			for(int i=c+1; i<arr.length; i++)
				if(arr[i]<item)
					pos++;
			int temp = arr[pos];
			arr[pos] = item; 
			item = temp;
			
			while(pos != c)
			{ 
				pos = c;
				for(int i=c+1; i<arr.length; i++)
					if(arr[i]<item)
						pos++;
				int temp1 = arr[pos];
				arr[pos] = item; 
				item = temp1;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {20,40,50,10,30};
		cycleSort(arr);
		
		for(int print : arr)
			System.out.print(print+" ");

	}

}
