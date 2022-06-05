package mathematicsPractice;

public class LCM_Of_Two_Numbers {

	/*
	int LCM(int a, int b) {
		int n = a*b;
		for(int i=1; i<=n; i++) {
			if(i%a==0 && i%b==0) { 
				return i;
			}
		}
		return n;
	} */
	
//	Efficient Solution
	int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	int LCM(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	public static void main(String[] args) {
		
		LCM_Of_Two_Numbers obj = new LCM_Of_Two_Numbers();
		
		System.out.println(obj.LCM(12, 15));

	}

}
