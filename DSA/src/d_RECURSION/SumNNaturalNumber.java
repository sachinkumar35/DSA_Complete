package d_RECURSION;

public class SumNNaturalNumber {
	
	static void printSum(int n, int sum, int a) {
		if(n==0) {
			System.out.println(sum);
			return;
		}
		sum=sum+n;
		printSum(n-1,sum, a+1);
		System.out.println(a++);
		
	}
	public static void main(String[] args) {
		
		printSum(10, 0, 1);
	}

}
