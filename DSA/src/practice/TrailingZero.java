package practice;

public class TrailingZero {
	static int trailing(int n) {
		int r=0;
		for(int i=5; i<=n; i=i*5)
			r=r+n/i;
		return r;
	}
	public static void main(String[] args) {
		trailing(100);

	}

}
