package b_MathematicsPractice;

public class PalindromeNumber {
	boolean palindrom(long n) {
		
		long palin=0, number = n, r;
		while(n!=0) {
			r=n%10;
			palin= palin*10+r;
			n=n/10;
		}
		return (palin==number);
	}
	public static void main(String[] args) {
		PalindromeNumber obj = new PalindromeNumber();
		System.out.println(obj.palindrom(399339933993L));

	}

}
