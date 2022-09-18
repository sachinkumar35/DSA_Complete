package i_Hashing;

public class PrintPowerOfX {

	static int powX(int x, int n) {
		if(n==0)
			return 1;
		if(x==0)
			return 0;
		return x*powX(x,n-1);
	}
	public static void main(String[] args) {
		System.out.println(powX(3, 3));
	}
}
