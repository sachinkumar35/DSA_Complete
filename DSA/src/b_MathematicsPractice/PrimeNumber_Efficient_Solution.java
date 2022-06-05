package b_MathematicsPractice;

public class PrimeNumber_Efficient_Solution {

	boolean prime(int n) {
		if(n==1) return false;
		if(n==2 || n==3 || n==5 || n==7) return true;
		if(n%2==0 || n%3==0 || n%5==0 || n%7==0) return false;
		return true;
	}
	public static void main(String[] args) {
		
		PrimeNumber_Efficient_Solution obj = new PrimeNumber_Efficient_Solution();
			System.out.println(obj.prime(101));
		
	}
}
