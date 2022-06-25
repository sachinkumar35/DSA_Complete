package practice;

public class LrgestElementofArray {
	static int largest(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean f=true;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					f=false;
					break;
				}
			}
			if(f==true) return i;
		}
		return -1;
	}
	public static void main(String[] args) {

		int arr[] = {5,5,3,8,44,7,5,200,4,6,23};
		System.out.println(largest(arr));


	}

}
