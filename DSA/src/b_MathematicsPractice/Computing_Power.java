package b_MathematicsPractice;

public class Computing_Power {
	
	int power(int x, int n) {
		int r=1;
		for(int i=1; i<=n; i++) 
			r=r*x;
		return r;
	}
	public static void main(String[] args) {
		Computing_Power obj = new Computing_Power();
		System.out.println(obj.power(2, 3));
	}
	
}  // complexity : theetha(n)

