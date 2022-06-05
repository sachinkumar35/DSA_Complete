package mathematicsPractice;

public class Factorial_Of_Number_Recursion {

	int fact(int n) {
		if(n==0) return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Factorial_Of_Number_Recursion obj = new Factorial_Of_Number_Recursion();
		System.out.println(obj.fact(6));

	}

}
