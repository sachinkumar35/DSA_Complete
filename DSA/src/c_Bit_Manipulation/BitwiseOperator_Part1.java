package c_Bit_Manipulation;

public class BitwiseOperator_Part1 {

	public static void main(String[] args) {
		
		int x=3,y=6;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println();
		
//	Left Shift (<<)	
		System.out.println(3<<1);
		System.out.println(3<<4);
		System.out.println(x<<y);
		System.out.println();
		
//	Right Shift (>>)
		System.out.println(12>>2);
		System.out.println(40>>4);
		System.out.println();
		
//	Not Operator (~)
		System.out.println(~1);
		System.out.println(~5);
	}

}
