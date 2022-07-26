package g_Sorting;

public class MinimumDifference {

	public static int minDiff(int arr[])
	{
		int res = Integer.MAX_VALUE;
		for(int i=1; i<arr.length; i++)
		{
			for(int j=0; j<i; j++)
		 
				res= Math.min(res, Math.abs(arr[i]-arr[j]));
		}
		return res;
	}

	public static void main(String[] args) {
		
		int arr[] = {10,5,3,9,1,12};
		System.out.println(minDiff(arr));
	}

}
