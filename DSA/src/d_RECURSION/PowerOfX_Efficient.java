package d_RECURSION;

public class PowerOfX_Efficient {

	static int powX(int x, int n) {
		if(n==0)
			return 1;
		if(x==0)
			return 0;
		if(n%2==0)
			return powX(x,n/2)*powX(x,n/2);
		else
			return powX(x,n/2)*powX(x,n/2)*x;
	}
	public static void main(String[] args) {
		System.out.println(powX(2, 5));
	}
}
