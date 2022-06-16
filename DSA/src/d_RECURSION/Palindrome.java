package d_RECURSION;

public class Palindrome {

	static boolean palin(String str, int start, int end) {
		if(start>=end) {
			return true;
		}
		if(str.charAt(start)!=str.charAt(end)) return false;
		return palin(str, start+1, end-1);
//		return((str.charAt(start)==str.charAt(end)) && palin(str, start+1, end-1));
		
	}
	public static void main(String[] args) {
		String s = "ygadabaddabadagy";
		System.out.println(palin(s,0,s.length()-1));

	}

}
