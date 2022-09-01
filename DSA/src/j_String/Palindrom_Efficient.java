package j_String;

public class Palindrom_Efficient {

	static boolean isPalin(String s) {
		int first = 0; 
		int end = s.length()-1;
		while(first < end)
		{
			if(s.charAt(first) != s.charAt(end))
				return false;
			
			first++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "AABBCCBBAA";
		System.out.println(isPalin(s));
	}
}
