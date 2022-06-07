package c_Bit_Manipulation;

public class Kth_Bit_is_Set {

//	by Left shift
//	void kth(int n, int k) {
//		if((n & (1<<(k-1)))!=0) System.out.println("yes");
//		else System.out.println("No");
//	}

//	by right shift
	void kth(int n, int k) {
		if(((n>>(k-1))&1)==1) System.out.println("yes");
		else System.out.println("No");
	}
	public static void main(String[] args) {
		Kth_Bit_is_Set obj = new Kth_Bit_is_Set();
		obj.kth(5, 1);
		


	}

}
