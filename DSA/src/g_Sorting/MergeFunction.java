package g_Sorting;

public class MergeFunction {

	public static void mergeFun(int a[], int low, int mid, int high)
	{
		int n1=mid-low+1, n2 = high-mid;
		int left[] = new int[n1], right[] = new int[n2];
		
		for(int i=0; i<n1; i++)
			left[i] = a[low+i];
		for(int i=0; i<n2; i++)
			right[i] = a[mid+i+1];
		
		int i=0, j=0, k=0;
		
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j]) {
				a[k]=left[i];
				k++;
				i++;
			}
			else {
				a[k]=right[j];
				k++;
				j++;
			}
		}
		while(i<n1) {
			a[k]=left[i];
			k++;
			i++;
		}
		while(j<n2) {
			a[k]=right[j];
			k++;
			j++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,15,20,40,8,11,55};
		int low =0; 
		int mid =3; 
		int high = 6; 
		
		mergeFun(arr, low, mid, high);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
