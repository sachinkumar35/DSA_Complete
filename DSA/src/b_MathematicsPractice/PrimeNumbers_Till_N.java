package b_MathematicsPractice;

public class PrimeNumbers_Till_N {

	void AllPrime(int n) {
		for(int i=2; i<=n; i++) {
			if(prime(i)==true) System.out.println(i);
			}
		}
	boolean prime(int m) {
		for(int i=2; i*i<=m; i++) {
			if(m%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		PrimeNumbers_Till_N obj = new PrimeNumbers_Till_N();
		obj.AllPrime(50);

	}

}
