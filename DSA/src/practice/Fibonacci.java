package practice;

public class Fibonacci {

	static void fibo(int n, int a, int b)
	{
		if(n==0)
			return;
		int c = a+b;
		System.out.print(c+",");
		fibo(n-1,b,c);
	}
	public static void main(String[] args) {
		System.out.print(0+",");
		System.out.print(1+",");
		
		fibo(6, 0, 1);

	}

}
