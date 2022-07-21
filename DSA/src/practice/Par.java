package practice;

public class Par {
	
	static void par(int arr[], int l, int h, int p)
	{
		int temp[] = new int[h-l+1], k=0;
		for(int i=l; i<=h; i++)
			if(arr[i]<=arr[p] && i!= p)
			temp[k++] = arr[i];
		temp[k++]=arr[p];
		for(int i=0; i<=h; i++)
			if(arr[i]>arr[p])
				temp[k++]=arr[i];
		for(int i=0; i<=h; i++)
			arr[i]=temp[i];
	}
	public static void main(String[] args) {
		int arr[] = new int[]{5,11,6,9,12,11,8};
        int n = arr.length;
        par(arr,0,n-1,5);
	    for(int x: arr)
	        System.out.print(x+" ");
	}
}
