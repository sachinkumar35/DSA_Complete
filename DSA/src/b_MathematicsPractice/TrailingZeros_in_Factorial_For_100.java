package b_MathematicsPractice;

public class TrailingZeros_in_Factorial_For_100 {
	int zeroCount(int n) {
		int r=0;
		for(int i=5;i<=n;i*=5)
			r=r+n/i;
		return r;
	}
	public static void main(String[] args) {
		TrailingZeros_in_Factorial_For_100 obj = new TrailingZeros_in_Factorial_For_100();
		System.out.println(obj.zeroCount(12));
	}
}
