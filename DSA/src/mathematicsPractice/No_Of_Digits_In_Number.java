package mathematicsPractice;

public class No_Of_Digits_In_Number {
	
//	Iterative Solution
/*	int countDigit(long n) {
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
		return count;
	} */
	
	
//  Recursive Solution	
	int countDigit(long n) {
		if(n==0)
		return 0;
		return 1+countDigit(n/10);	
	} 
	
	
	
//	int countDigit(long n) {
//		return floor(log10(n)+1);
//	}

	public static void main(String[] args) {
		
		No_Of_Digits_In_Number obj = new No_Of_Digits_In_Number();
		
		System.out.println(obj.countDigit(12348));
	}

}
