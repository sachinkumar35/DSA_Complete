package d_RECURSION;

public class GenerateSubset_InString {

	static void printSub(String str, String curr, int i) {
		if(str.length()==i) {
			System.out.println(curr+" ");
			return;
		}
		printSub(str,curr,i+1);
		printSub(str,curr+str.charAt(i),i+1);
	}
	public static void main(String[] args) {
		String str= "ABC";
		printSub(str, "", 0);
	}

}
