package g_Sorting;

public class NaivePartition {

	static void partition(int arr[], int l, int h, int p)
	{
		int temp[] = new int[h-l+1], index=0;
		for(int i=l; i<=h; i++)
			if(arr[i]<arr[p]) temp[index++] = arr[i];
			
		for(int i=l; i<=h; i++)
			if(arr[i]==arr[p]) temp[index++] = arr[i];
		
		int res = l+index-1;
		
		for(int i=l; i<=h; i++)
			if(arr[i]>arr[p]) temp[index++]=arr[i];
				
		for(int i=l; i<=h; i++) arr[i]=temp[i-l];
			
		System.out.println("Pivot element "+ arr[res]+" At Index "+res);
	}
	public static void main(String[] args) {
		int arr[] = new int[]{5,13,6,9,12,11,8};
        int n = arr.length;
        partition(arr,0,n-1,n-1);
	    for(int x: arr)
	        System.out.print(x+" ");
	    
	}
}