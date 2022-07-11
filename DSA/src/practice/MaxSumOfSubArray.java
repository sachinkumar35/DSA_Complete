package practice;

public class MaxSumOfSubArray {
	
	public static int sum(int[] arr)
	{
		int endl = arr[0],res=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			endl=Math.max(arr[i], arr[i]+endl);
			res=Math.max(res,endl);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {6,-2,2,-6,7,1,-6};
		System.out.println(sum(arr));
	}

}