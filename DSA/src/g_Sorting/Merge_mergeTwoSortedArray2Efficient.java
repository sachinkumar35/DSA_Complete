package g_Sorting;

public class Merge_mergeTwoSortedArray2Efficient {

	public static void mergeTwoArrays(int a[], int b[])
	{
		int m = a.length;
		int n = b.length;
		int i=0, j=0; 
		
		while(i<m && j<n)
		{
			if(a[i] <= b[j])
			{
				System.out.print(a[i]+" ");
				i++;
			}
			else {
				System.out.print(b[j]+" ");
				j++;
			}
		}
		while(i<m) {
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n) {
			System.out.print(b[j]+" ");
			j++;
		}
	}
	public static void main(String[] args) {
		int arr1[] = {10,20,50};
		int arr2[] = {5, 50,50};
		
		mergeTwoArrays(arr1, arr2);
	}
}
