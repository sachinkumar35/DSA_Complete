package practice;

public class N_M_WaysInMatrix {
	
	public static int ways(int n, int m)
	{
		if(n==1||m==1)
			return 1;
		
		return ways(n-1,m)+ways(n,m-1);
	}

	public static void main(String[] args) {
		
		System.out.println(ways(4,3));

	}

}
