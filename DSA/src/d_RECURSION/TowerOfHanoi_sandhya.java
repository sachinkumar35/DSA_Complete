package d_RECURSION;

public class TowerOfHanoi_sandhya {

	static void toh(int n, String s, String h, String d) {
		if(n==1){
			System.out.println("Transfer disk "+n+" from "+s+" to "+d);
			return;
		}
		toh(n-1,s,d,h);
		System.out.println("Transfer disk "+n+" from "+s+" to "+d);
		toh(n-1, h, s, d);
	}
	public static void main(String[] args) {
		int num = 3;
		toh(num, "S", "H", "D");
	}

}
