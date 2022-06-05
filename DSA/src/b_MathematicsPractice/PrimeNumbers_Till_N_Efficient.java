package b_MathematicsPractice;

public class PrimeNumbers_Till_N_Efficient {
	
	void sieve(int n) {
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++) prime[i]=true;
		for(int i=2; i<=n; i++) {
			if(prime[i]) {
				System.out.println(i);
				for(int j=i*i; j<=n; j+=i) prime[j]=false;
			}
		}
	}
	public static void main(String[] args) {
		PrimeNumbers_Till_N_Efficient obj =new PrimeNumbers_Till_N_Efficient();
		obj.sieve(20);
	}
}



// Time complexity : O(n long log n)