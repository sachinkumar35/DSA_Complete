package d_RECURSION;

public class Calculate_XpowerN {

	static int calcPower(int x, int n) {
		if(n==0) return 1;
		if(x==0) return 0;
		int xPower=calcPower(x,n-1);
		return x*xPower;
		
	}
	public static void main(String[] args) {
		int x=2, n=4;
		System.out.println(calcPower(5, 2));

	}

}
