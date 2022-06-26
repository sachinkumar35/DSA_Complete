package e_Arrays;

public class Consecutive_of_1s_sandeep {
	static int max(int arr[]) {
		int res=0, curr=0;
		int n=arr.length;
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) curr=0;
			else {
				curr++;
				res=Math.max(res, curr);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {1,0,1,1,1,1,0,1,1};
		System.out.println(max(arr));
	}
}
