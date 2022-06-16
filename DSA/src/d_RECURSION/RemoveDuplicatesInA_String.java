package d_RECURSION;

public class RemoveDuplicatesInA_String {

	public static boolean[] map = new boolean[26];
	public static void remDuplicate(String str, int i, String s) {
		if(i==str.length()) {
			System.out.println(s);
			return;
		}
		char currChar = str.charAt(i);
		if(map[currChar - 'a']) {
			remDuplicate(str, i+1, s);
		}
		else {
			s+=currChar;
			map[currChar - 'a'] = true;
			remDuplicate(str, i+1, s);
		}
		
	}
	public static void main(String[] args) {
		remDuplicate("aaaddcaabxxddza", 0, "");
	}

}
