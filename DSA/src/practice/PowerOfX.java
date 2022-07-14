package practice;

public class PowerOfX {

	static int pow(int x, int n)
	{
		if(x==0) return 0;
		if(n==0) return 1;
		return x*pow(x,n-1);
	}
	public static void main(String[] args) {
		System.out.println(pow(2,6));

	}

}
