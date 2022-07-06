package f_Searching;

public class Triplet_Solution_ForLoop {

	public static boolean triplet(int arr[], int x) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k] == x)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {3,6,8,10,36,39,40,45};
		int x = 59;
		System.out.println(triplet(arr, x));

	}

}
