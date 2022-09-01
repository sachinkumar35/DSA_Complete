package j_String;

public class IsStringSubsequence {

	static boolean isSub(String s1, String s2) {
		int j=0; 
		for(int i=0; i<s1.length() && j<s2.length(); i++)
		{
			if(s1.charAt(i)==s2.charAt(j))
				j++;
		}
		return (j==s2.length());
		
	}
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Scn";
		System.out.println(isSub(s1, s2));
	}

}
