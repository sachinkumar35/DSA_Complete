package d_RECURSION;

public class FactorialOfN {
	static int factorial(int n) {
		if(n==1 || n==0) return 1;
		int fact_s= factorial(n-1);
		int fact= n*fact_s;
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
