package practice;

public class p {
	static void fun(String str, int i ) {
		if(str.charAt(i) == str.charAt(0)) {
			System.out.println(0+" "+ i);
			return;
		}
		fun(str, i-1);
	}
	public static void main(String[] args) {
		String s = "sachinsbhardwajsaaa";
		fun(s,s.length()-1);
	}
}
