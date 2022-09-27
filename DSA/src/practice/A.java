package practice;

import java.util.*;

public class A {

	static int lexicographicRank(String s) {
		int n = s.length();
		Vector<Integer>[] alphaIndex = new Vector[26];
		for (int i = 0; i < alphaIndex.length; i++)
			alphaIndex[i] = new Vector<Integer>();

		for (int i = 0; i < s.length(); i++) {
			int x = s.charAt(i) - 'a';
			alphaIndex[x].add(i);
		}
		int rank = 0;
		for (int i = 0; i < 26 && 'a' + i < s.charAt(0); i++) {
			if (alphaIndex[i].size() > 0) {
				for (int j = 0; j < alphaIndex[i].size(); j++) {
					rank = rank + (n - alphaIndex[i].get(j));
				}
			}
		}
		Vector<String> str = new Vector<String>();

		for (int i = 0; i < alphaIndex[s.charAt(0) - 'a'].size(); i++) {
			String subString = "";

			int j = alphaIndex[s.charAt(0) - 'a'].get(i);

			for (; j < n; j++) {
				subString += (s.charAt(j));
				str.add(subString);
			}
		}
		Collections.sort(str);
		for (int i = 0; i < str.size(); i++) {
			if (!str.get(i).equals(String.valueOf(s))) {
				rank++;
			} else {
				break;
			}
		}
		return rank + 1;
	}

	public static void main(String[] args) {
		String str = "abc";

		System.out.print(lexicographicRank(str));
	}
}
