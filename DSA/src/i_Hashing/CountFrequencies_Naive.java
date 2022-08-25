package i_Hashing;

public class CountFrequencies_Naive {

	static void Freq(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					flag = true;
					break;
				}
			}
			if(flag == true)
				continue;
			
			int freq = 1;
			for(int j=i+1; j<arr.length; j++) 
				if(arr[i] == arr[j])
					freq++;
				
			System.out.println(arr[i]+"  "+freq);
		}
	}
	public static void main(String[] args) {
		int arr[] = {100,20,10,30,20,30,50,40,60,40,90,100,50,30,20,10,20,10};
		Freq(arr);
	}
}
