package e_Arrays;

public class MaximumDiffrence1 {

	static int maximum(int arr[]) {
		int res=arr[1]-arr[0];
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				res= Math.max(res, arr[j]-arr[i]);
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		int arr[] = {2,3,10,6,4,8,1};
//		int arr[] = {7,9,5,6,3,2};
//		int arr[] = {30,10,8,2};
		
		System.out.println(maximum(arr));

	}

}
