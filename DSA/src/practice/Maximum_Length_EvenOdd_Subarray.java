package practice;

public class Maximum_Length_EvenOdd_Subarray {

	public static void main(String[] args) {
		int arr[] = {5,10,20,6,3,8};
		int count =1,max=0;
		for(int i=1; i<arr.length; i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i-1]%2==0 && arr[i]%2!=0)) { 
				count++;
				if(max<count)
					max=count;
			}
			else count=1;
		}
		System.out.println(count);
	}

}
