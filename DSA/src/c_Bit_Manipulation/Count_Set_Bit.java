package c_Bit_Manipulation;

public class Count_Set_Bit {

//	Naive solution
/*	int countSet(int n) {
		int r=0;
		while(n>0) {
			if(n%2!=0) r++;
			n=n/2;
		}
		return r;
	} */
	
//	Using Bitwise Operator
	int countSet(int n) {
		int r=0;
		while(n>0) {
			r=r+(n&1);
			n=(n>>1);
		}
		return r;
	} 
	
	public static void main(String[] args) {
		
		Count_Set_Bit obj = new Count_Set_Bit();
		System.out.println(obj.countSet(40));
	}

}
