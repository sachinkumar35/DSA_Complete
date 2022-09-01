package i_Hashing;

public class FibonacciSeries {

	static void fibo(int a, int b, int n) {
		if(n==0)
			return;
		System.out.print(a+b+" ");
		fibo(b,a+b,n-1);
	}
	public static void main(String[] args) {
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		fibo(a, b, 10-2);
	}
}
