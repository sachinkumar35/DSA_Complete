package practice;

public class primeNumber {

	static void prime(int n) {
		for(int i=2; i*i<n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
				i=1;
			}			
		}
		if(n!=0) System.out.print(n);
	}
	public static void main(String[] args) {
	prime(315);
}
}
