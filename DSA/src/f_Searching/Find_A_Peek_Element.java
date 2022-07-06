package f_Searching;

public class Find_A_Peek_Element {
	public static int peek(int arr[]) {
		if(arr[0]>arr[1]) return arr[0];
		if(arr[arr.length-1]>arr[arr.length-2]) return arr[arr.length-1];
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {2,6,34,3,2,6,75,3500,676};
		System.out.println(peek(arr));
	}
}
