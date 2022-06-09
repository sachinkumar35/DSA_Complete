package d_RECURSION;

public class ii_PraccticeProgram {
	static int fun(int n) {
		if(n==0) return 0;
		else
			return 1+fun(n/2);
	}
	public static void main(String[] args) {
		
		System.out.println(fun(79));
	}

}
