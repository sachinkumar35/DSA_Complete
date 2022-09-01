package j_String;

public class Palindrom_Naive {

	static boolean isPalin(String s) {
		StringBuilder rev = new StringBuilder(s);
		rev.reverse();
		return s.equals(rev.toString());
	}
	public static void main(String[] args) {
		String s = "ABCCBA";
		System.out.println(isPalin(s));
	}

}
