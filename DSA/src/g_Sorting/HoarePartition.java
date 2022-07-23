package g_Sorting;

public class HoarePartition {
	
	public static void hoare(int arr[], int l, int h)
	{
		int p = arr[l];
		while(l<=h) {
			if(arr[l]>=p && arr[h]< p) {
				int swap = arr[l];
				arr[l] = arr[h]; 
				arr[h] = swap;
				l++; h--;
			}
			else if(arr[l]<p) l++;
			else if(arr[h]>p) h--;
		}
		// if we want to return then return h;
		System.out.println(h);
	}

	public static void main(String[] args) {
		int arr[] = {5,3,8,4,2,7,1,10};
		int l=0, h=arr.length;
		hoare(arr, l, h-1);
		
		for(int print : arr)
			System.out.print(print+" ");
	}
}
