package d_RECURSION;

public class FindOccurenceOfAn_element_inString {

	public static int first = -1;
	public static int last = -1;
	public static void occ(String str, int i, char el) {
		if(i==str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
			
		}
		char current_cur = str.charAt(i);
		if(current_cur == el) {
			if(first == -1) {
				first = i;
			}
			else last = i;
		}
		occ(str, i+1, el);
	}
	public static void main(String[] args) {
		String s = "abbbbcccaaddddeaee";
		occ(s, 0, 'c');
	}
}
