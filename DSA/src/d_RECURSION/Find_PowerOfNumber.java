package d_RECURSION;

public class Find_PowerOfNumber {
	static int pow(int n, int p) {
		if(p==0) return 1;
		if(n==0) return 0;
		return pow(n,p-1)*n;
	}
	public static void main(String[] args) {
		
		System.out.println(pow(3, 0));

	}

}
