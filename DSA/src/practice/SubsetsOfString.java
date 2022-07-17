package practice;

public class SubsetsOfString {

	public static void subsets(String s, String c, int i)
	{
		if(i==s.length())
		{
			System.out.print(c+",");
			return;
		}
		subsets(s,c,i+1);
		subsets(s,c+s.charAt(i),i+1);
	}
	public static void main(String[] args) {
		String s = "ABC";
		subsets(s, "", 0);
		

	}

}
