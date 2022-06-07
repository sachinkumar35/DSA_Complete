package c_Bit_Manipulation;

public class Count_Set_Bits_BrianKerningamsAlgo {

	int countBits(int n) {
		int r=0;
		while(n>0) {
			n=(n&(n-1));
			r++;
		}
		return r;
	}
	public static void main(String[] args) {
		Count_Set_Bits_BrianKerningamsAlgo obj = new Count_Set_Bits_BrianKerningamsAlgo();
		System.out.println(obj.countBits(257));
	}

}
