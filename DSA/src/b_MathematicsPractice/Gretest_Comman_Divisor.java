package b_MathematicsPractice;

public class Gretest_Comman_Divisor {

/*	int gcd(int a, int b) {
		int i;
		int n = (a<b) ? a:b;
		for(i=n; n>=1; i--) {
			if(a%i==0 && b%i==0) 
				break;
		}
		return i;
	}
	*/
	
//	EUCLIDEAN ALGORITHM
/*	int gcd(int a, int b) {
		while(a!=b)
		{
			if(a>b) a=a-b;
			else b=b-a;
		}
		return a;
	} */
	
//	Optimized Implementation of Euclidean Algorithm
	int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		
		Gretest_Comman_Divisor obj = new Gretest_Comman_Divisor();
		
		System.out.println(obj.gcd(12, 15));

	}

}
