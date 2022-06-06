package b_MathematicsPractice;

public class PrimeNumber_Efficient_Solution {

	boolean prime(int n) {
		if(n==1) return false;
		if(n==2 || n==3 ) return true;
		if(n%2==0 || n%3==0 ) return false;
		for(int i=5;i*i<=n;i+=6)
			if(n%i==0 || n%(i+2)==0)
				return false;
		
		return true;
	}
	public static void main(String[] args) {
		
		PrimeNumber_Efficient_Solution obj = new PrimeNumber_Efficient_Solution();
			System.out.println(obj.prime(121));
		
	}
}
