package practice;

public class TrappingWater {

	public static int water(int arr[]) {
		int res = 0;
		int[] left = new int[arr.length];
		int[] right= new int[arr.length];
		left[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			left[i]= Math.max(arr[i], left[i-1]);
		}
		right[arr.length-1] = arr[arr.length-1];
		for(int i=arr.length-2; i>=0; i--) {
			right[i] = Math.max(arr[i], right[i+1]);
		}
		for(int i=0; i<arr.length; i++)
			res += Math.min(left[i], right[i])-arr[i];
		
		return res;
	}
	public static void main(String[] args) {
//		int arr[] = {4,6,2,9,3,6,4};
		int arr[] = {5,0,6,2,3};

		System.out.println(water(arr));

	}

}
