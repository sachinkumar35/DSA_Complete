package mathematicsPractice;

public class PrimeNumber {

	boolean prime(int n) {
		if(n==1) return false;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		System.out.println(obj.prime(103));

	}

}
