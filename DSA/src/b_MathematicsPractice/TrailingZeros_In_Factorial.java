package b_MathematicsPractice;

public class TrailingZeros_In_Factorial {

	int countZero(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		int r=0;
		while(fact%10==0) {
			r++;
			fact=fact/10;
		}
		return r;
	}
	public static void main(String[] args) {
		TrailingZeros_In_Factorial obj = new TrailingZeros_In_Factorial();
		
		System.out.println(obj.countZero(12));
	}
	
}
