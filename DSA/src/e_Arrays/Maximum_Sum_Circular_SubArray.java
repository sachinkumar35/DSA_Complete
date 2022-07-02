package e_Arrays;

public class Maximum_Sum_Circular_SubArray {

	private static int normalMaxSubArray(int arr[]) {
		int res=arr[0], maxEnding= arr[0];
		for(int i=1; i<arr.length; i++) {
			maxEnding = Math.max(maxEnding+arr[i], arr[i]);
			res = Math.max(maxEnding, res);
		}
		return res;
	}
	
	public static int CircularMaxSubArray(int arr[]) {
		int NormalMax = normalMaxSubArray(arr);
		if(NormalMax < 0) return NormalMax;
		int totalSum=0;
		for(int i=0; i<arr.length; i++) {
			totalSum += arr[i];
			arr[i] *=-1;
		}
		int max_Circular = totalSum+normalMaxSubArray(arr);
		return Math.max(NormalMax, max_Circular);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,1,-6,-8,1,-9,-1,3,1};
		System.out.println(CircularMaxSubArray(arr));

	}

}
