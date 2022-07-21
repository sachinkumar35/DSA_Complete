package g_Sorting;

public class CountInversions_1 {

	public static int countInv(int arr[])
	{
		int n = arr.length, count=0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j])
					count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int arr[] = {2,4,1,3,5};
		System.out.println(countInv(arr));

	}

}
