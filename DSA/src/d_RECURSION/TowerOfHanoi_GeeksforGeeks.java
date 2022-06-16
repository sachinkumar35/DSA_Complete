package d_RECURSION;

public class TowerOfHanoi_GeeksforGeeks {

	static void toh(int n, char A, char B, char C) {
		if(n==1){
			System.out.println("Transfer disk "+n+" from "+A+" to "+C);
			return;
		}
		toh(n-1,A,C,B);
		System.out.println("Transfer disk "+n+" from "+A+" to "+C);
		toh(n-1, B, A, C);
	}
	public static void main(String[] args) {
		int num = 4;
		toh(num, 'A', 'B', 'C');
	}

}
