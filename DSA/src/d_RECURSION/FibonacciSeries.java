package d_RECURSION;

public class FibonacciSeries {

	static void fib(int a, int b, int n) {
		if(n==0) return;
		int c=a+b;
		System.out.println(c);
		fib(b,c,n-1);
	}
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		int n=10;
		fib(0, 1, n-2);

	}

}
