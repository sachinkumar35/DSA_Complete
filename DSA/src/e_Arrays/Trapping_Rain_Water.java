package e_Arrays;

public class Trapping_Rain_Water {
	public static int WaterAmmount(int arr[]) {
		int res=0;
		for(int i=1; i<arr.length-1; i++) {
			int lmax = arr[i];
			for(int j=0; j<i; j++)
				lmax= Math.max(lmax, arr[j]);
			int rmax = arr[i];
			for(int j=i+1; j<arr.length; j++)
				rmax = Math.max(rmax, arr[j]);
			res= res+(Math.min(lmax, rmax)-arr[i]);
		}
		return res;
	}
	public static void main(String[] args) {
//		int arr[] = {2,0,2};
//		int arr[] = {1,1,5,2,7,6,1,4,2,3};
		int arr[] = {1,8,5,7,6};
//		int arr[] = {3,2,1};
		System.out.println(WaterAmmount(arr));
	}
}
