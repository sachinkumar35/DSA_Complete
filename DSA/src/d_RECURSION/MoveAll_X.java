package d_RECURSION;

public class MoveAll_X {
	
	static void moveX(String str, int i, String s1, String s2) {
		if(i==str.length()) {
			System.out.println(s1+s2);
			return;
		}
		char currChar = str.charAt(i);
		if(currChar=='x' || currChar=='X') {
			s2+=currChar;
			moveX(str, i+1, s1, s2);
		}
		else {
			s1+=currChar;
			moveX(str, i+1, s1, s2);
		}
	}

	public static void main(String[] args) {
		String s= "axbdajidxxdcxxdx";
		moveX(s, 0, "", "");

	}

}
