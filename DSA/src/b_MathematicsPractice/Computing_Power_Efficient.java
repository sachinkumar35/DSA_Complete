package b_MathematicsPractice;

public class Computing_Power_Efficient {

	int power(int x, int n) {
		if(n==0) return 1; 
		int temp = power(x,n/2);
		temp = temp*temp;
		if(n%2==0) return temp;
		else return temp*x;
	}
	public static void main(String[] args) {

		Computing_Power_Efficient obj = new Computing_Power_Efficient();
		System.out.println(obj.power(5, 3));
	}

}
