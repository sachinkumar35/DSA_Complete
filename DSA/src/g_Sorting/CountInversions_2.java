package g_Sorting;

public class CountInversions_2 {
	
	private static int countAndMergeFun(int arr[], int l, int m, int r)
	{
		int n1 = m-l+1, n2 = r-m;
		int left[] = new int[n1], right[] = new int[n2];
		for(int i=0; i<n1; i++)
			left[i] = arr[l+i];
		for(int j=0; j<n2; j++)
			right[j] = arr[m+1+j];
		
		int i=0, j=0, k=l, res=0;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j]) { arr[k++] = left[i++]; }
			else {arr[k++] = right[j++]; res += (n1-i);}	
		}
		while(i<n1) {arr[k++] = left[i++];}
		while(j<n2) {arr[k++] = right[j++];}
		
		return res;
	}
	public static int countInversions(int arr[], int l, int r)
	{
		int res=0;
		if(l<r)
		{
			int m = l + (r-l)/2;
			res+=countInversions(arr, l, m);
			res+=countInversions(arr, m+1, r);
			res+=countAndMergeFun(arr, l, m, r);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {2,4,1,3,5,4,6,1};
		System.out.println(countInversions(arr,0,arr.length-1));
	}
}
