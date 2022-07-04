package f_Searching;

public class SquareRoot_binaryAlgo {

	public static int squareRoot(int x) {
		int low=0, high=x, ans=1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			int sqrt = mid*mid;
			if(sqrt==x)
				return mid;
			else if(sqrt>x)
				high = mid-1;
			else
			{
				low = mid+1;
				ans= mid;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int x=9;
		System.out.println(squareRoot(x));

	}

}
