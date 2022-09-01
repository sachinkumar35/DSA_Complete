package practice;

public class SumNaturalNumber {
	
	static int fun(int n) {

		if(n==0)
			return 0;
		return n+fun(n-1);
	}
	public static void main(String[] args) {
		System.out.println(fun(6));
	}

}
