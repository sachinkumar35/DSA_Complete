package e_Arrays;

public class Maximum_Length_EvenOdd_SubArray {

	public static int Length(int arr[]) {
		int count=1, max=1;
		for(int i=1; i<arr.length; i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)) {
				count++;
				if(max<count) max=count;
			}
			else 
				count = 1;
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {7,10,13,4,8,3,2,5,6};
		System.out.println(Length(arr));

	}

}
