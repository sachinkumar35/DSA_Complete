package mathematicsPractice;

public class primeFactors {

	void primeFactor(int n) {
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				System.out.println(i+" ");
				n=n/i;
				i=1;
			}
		}
		if(n!=0) System.out.println(n);
	}
	public static void main(String[] args) {
		
		primeFactors obj = new primeFactors();
		obj.primeFactor(12);

	}

}
