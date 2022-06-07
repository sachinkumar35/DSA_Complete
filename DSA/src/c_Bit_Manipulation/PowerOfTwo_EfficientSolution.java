package c_Bit_Manipulation;

public class PowerOfTwo_EfficientSolution {
	boolean power(int n) {
		return (n!=0) &&((n & (n-1))==0);
	}
	public static void main(String[] args) {
		PowerOfTwo_EfficientSolution obj = new PowerOfTwo_EfficientSolution();
		System.out.println(obj.power(16));
	}
}
