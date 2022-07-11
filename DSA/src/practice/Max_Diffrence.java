package practice;

public class Max_Diffrence {

	public static int diff(int arr[]) {
		int res=arr[1]-arr[0];
		int minval= arr[0];
		for(int i=1; i<arr.length; i++) {
			res = Math.max(res, arr[i]-minval);
			minval = Math.min(minval, arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,10,1,11,19,2,21};
		System.out.println(diff(arr));
		
		

	}

}
