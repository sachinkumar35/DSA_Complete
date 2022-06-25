package practice;

public class LrgestElementofArray_Efficient {
	static int largest(int arr[]) {
		int res=0;
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>arr[res]) 
			{
				res=i;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {5,5,3,8,44,7,5,200,4,6,23};
		System.out.println(largest(arr));	}

}
