package b_MathematicsPractice;

public class Factorial_Of_Number {
	
	int factorial(int n) {
		int fact=1;
		for(int i=2; i<=n; i++)
			fact = fact * i;
		return fact;
	}
	public static void main(String[] args) {
		Factorial_Of_Number obj = new Factorial_Of_Number();
		System.out.println(obj.factorial(1));
	}
}
