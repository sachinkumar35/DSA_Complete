package j_String;

public class FrequenciesOfCharacterInSortedOrder {
	
	static void frequency(String s)
	{
		int count[] = new int[26];
		for(int i=0; i<s.length(); i++)
			count[s.charAt(i)-'a']++;
		for(int i=0; i<26; i++)
			if(count[i]>0)
				System.out.println((char)(i+'a')+" "+count[i]);
	}

	public static void main(String[] args) {
		
		String s = "geeksforgeeks";
		frequency(s);
	}

}
