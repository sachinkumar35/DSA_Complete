package e_Arrays;

public class Maximum_Sum_SubArray {

	static int maxSum(int arr[]) {
		int res=arr[0];
		for(int i=0;i<arr.length;i++) {
			int curr=0;
			for(int j=i;j<arr.length;j++) {
				curr=curr+arr[j];
				res= Math.max(res, curr);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,-2,3,-1,2};
		System.out.println(maxSum(arr));

	}

}
