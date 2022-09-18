package b_MathematicsPractice;


public class Prime_Factor {
	PrimeNumber_Efficient_Solution p = new PrimeNumber_Efficient_Solution();
	void primeFactor(int n) {
		for(int i=2; i*i<n; i++) {
			if(p.prime(i)) {
				int x = i;
				while(n%x==0)
				{
					System.out.print(i+" ");
					x=x*i;
				}
			}
		}
	}
		
	public static void main(String[] args) {
		
		Prime_Factor obj = new Prime_Factor();
		obj.primeFactor(315);
	}

}
