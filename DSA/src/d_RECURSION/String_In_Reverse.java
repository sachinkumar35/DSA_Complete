package d_RECURSION;

public class String_In_Reverse {
	static void revString(String s, int i) {
		if(i==0) {
			System.out.print(s.charAt(i));  
			return;
		}
		System.out.print(s.charAt(i));
		revString(s, i-1);
	}
	public static void main(String[] args) {
		String str = "Sachin";
		revString(str, str.length()-1);

	}

}
