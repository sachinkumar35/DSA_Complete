package d_RECURSION;

public class SumNNaturalNumber {
	
//	static void printSum(int n, int sum, int a) {
//		if(n==0) {
//			System.out.println(sum);
//			return;
//		}
//		sum=sum+n;
//		printSum(n-1,sum, a+1);
//		System.out.println(a++);
//		
//	}
	static int printSum(int n) {
		if(n==0) return 0;
		return n+printSum(n-1);
	}
	public static void main(String[] args) {
		
//		printSum(10, 0, 1);
		System.out.println(printSum(10));
	}

}
