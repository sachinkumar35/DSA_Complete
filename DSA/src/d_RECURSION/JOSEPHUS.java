package d_RECURSION;

public class JOSEPHUS {
	static int JOS(int n, int k) {
		if(n==1) return 0;
		return (JOS(n-1,k)+k)%n;
	}
	public static void main(String[] args) {
		
		System.out.println(JOS(5,3));
	}
}
