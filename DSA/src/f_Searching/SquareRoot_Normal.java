package f_Searching;

public class SquareRoot_Normal {
	
	static int square(int x) {
		int i=1;
		while(i*i<=x)
		{
			i++;
		}
		return (i-1);
	}
	public static void main(String[] args) {
		int x=21;
		System.out.println(square(x));
	}

}
