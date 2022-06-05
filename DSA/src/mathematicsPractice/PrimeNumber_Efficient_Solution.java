package mathematicsPractice;

public class PrimeNumber_Efficient_Solution {

	boolean prime(int n) {
		if(n==1) return false;
		if(n==2 || n==3) return true;
		int k=n, l=n;
		if(k>5)
		k=(k+5)%5;
		if(l>7)
		l=(l+7)%7;
		if(n%2==0 || n%3==0 || k==0 || l==0) return false;
		return true;
	}
	public static void main(String[] args) {
		
		PrimeNumber_Efficient_Solution obj = new PrimeNumber_Efficient_Solution();
			System.out.println(obj.prime(101));
		
	}
}
