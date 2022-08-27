package i_Hashing;

public class SubArrayWithGivenSum_Naive {

	static boolean subArray(int arr[], int sum) {
		for(int i=0; i<arr.length; i++) {
			int currSum = 0;
			for(int j=i; j<arr.length; j++) {
				currSum += arr[j];
				if(currSum == sum) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {5,8,6,13,3,-1};
		int sum=22;
		System.out.println(subArray(arr, sum));

	}

}
