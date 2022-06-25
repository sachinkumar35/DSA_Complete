package e_Arrays;

public class MaximumDiffrence2_Efficient {

	public static int maximum(int arr[]) {
		int res= arr[1]-arr[0], minval=arr[0];
		for(int i=1; i<arr.length; i++) {
			res = Math.max(res, arr[i]-minval);
			minval= Math.min(minval, arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {8,2,10,6,4,12,1};
//		int arr[] = {7,9,5,6,3,2};
//		int arr[] = {30,10,8,2};
		
		System.out.println(maximum(arr));

	}

}
