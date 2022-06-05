package mathematicsPractice;

public class All_Divisors_Of_A_Number {
	
	void divisor(int n) {
		for(int i=1; i<=n/2; i++)
			if(n%i==0)
				System.out.print(i+" ");
		System.out.print(n);
	}
	public static void main(String[] args) {
		All_Divisors_Of_A_Number obj = new All_Divisors_Of_A_Number();
		obj.divisor(15);
	}

}
