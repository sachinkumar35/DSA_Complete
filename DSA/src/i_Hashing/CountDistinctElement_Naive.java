package i_Hashing;

public class CountDistinctElement_Naive {

	static int count(int arr[]) {
		int res=0; 
		for(int i=0; i<arr.length; i++) {
			boolean flag = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag==false)
				res++;
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,10,20,30,50,50,30,10,60,90,90,60,10,70,10};
		System.out.println(count(arr));
	}
	
}
