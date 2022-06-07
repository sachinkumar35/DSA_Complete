package c_Bit_Manipulation;


// *** THIS PROGRAM IS WRONG NOW


public class Convert_Number_to_Binary {
	
	void binary(int n) {
		while(n!=0) {
			if(n==1) {
				System.out.print(1);
				break;
			}
			if(n%2==0) System.out.print(0+" ");
			else System.out.print(1+" ");
			n=n/2;
		}
	}
	public static void main(String[] args) {
		Convert_Number_to_Binary obj = new Convert_Number_to_Binary();
		obj.binary(13);

	}

}
