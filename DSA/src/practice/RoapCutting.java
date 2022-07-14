package practice;

public class RoapCutting {

	public static int roap(int n, int a, int b, int c)
	{
		if(n==0) return 0;
		if(n<=-1) return -1;
		
		int res = Math.max(roap(n-a, a, b, c), Math.max(roap(n-b, a, b, c), roap(n-c, a, b, c)));
		
		if(res==-1) return -1;
		return res+1;
		
	}
	public static void main(String[] args) {
		System.out.println(roap(23, 12, 9, 11));
	}

}
