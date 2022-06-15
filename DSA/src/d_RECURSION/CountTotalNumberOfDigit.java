package d_RECURSION;

public class CountTotalNumberOfDigit {
	static int countDigit(int n) {
		if(n<10)
		return 1;
		return 1+countDigit(n/10);
	}
	public static void main(String[] args) {
		
		System.out.println(countDigit(12345));
	}

}
