package c_Bit_Manipulation;

public class PowerOfTwo {

	boolean powerOfTwo(int n) {
		if(n==0) return false;
		while(n>1) 
		{
			if(n%2!=0) return false;
			n/=2;
		}
		return true;
	}
	public static void main(String[] args) {
		PowerOfTwo obj = new PowerOfTwo();
		System.out.println(obj.powerOfTwo(18));
	}

}
