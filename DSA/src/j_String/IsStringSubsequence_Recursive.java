package j_String;

public class IsStringSubsequence_Recursive {

	static boolean isSub(String s1, String s2, int n, int m) {
		if(m==0)
			return true;
		if(n==0)
			return false;
		if(s1.charAt(n-1)==s2.charAt(m-1))
			return isSub(s1, s2, n-1, m-1);
		else 
			return isSub(s1, s2, n-1, m);
	}
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Scn";
		System.out.println(isSub(s1, s2, s1.length(), s2.length()));
	}

}
