package f_Searching;

public class Tow_Pointer_Approach {
	public static boolean sum(int arr[], int x) {
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==x)
					return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		int arr[] = {4,20,7,3,7,3,24,6,24,55,2,55,7};
		int x = 27;
		System.out.println(sum(arr, x));
	}

}
