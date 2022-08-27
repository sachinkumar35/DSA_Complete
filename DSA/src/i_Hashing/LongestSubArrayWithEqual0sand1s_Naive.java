package i_Hashing;

public class LongestSubArrayWithEqual0sand1s_Naive {

	static int longestSub(int arr[]) {
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			int c1=0, c2=0;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]==0)
					c1++;
				else
					c2++;
				if(c1==c2)
					res = Math.max(res, c1+c2);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {0,1,1,0,1,1,0,1};
		System.out.println(longestSub(arr));
	}

}
