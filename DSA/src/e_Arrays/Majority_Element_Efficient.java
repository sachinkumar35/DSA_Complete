package e_Arrays;

public class Majority_Element_Efficient {

	static int majority(int arr[]) {
		int res=0,count=1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[res]) 
				count++;
			else
				count--;
			if(count==0) {
				res=i;
				count=1;
			}
		}
		
		count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[res]==arr[i])
				count++;
		}
		if(count <= arr.length/2)
			res=-1;
		return res;
	}
	public static void main(String[] args) {
//		int arr[] = {6,8,4,8,8};
//		int arr[] = {3,7,4,7,7,5};
		int arr[] = {50,20,50,30,40,50,50,50,50,6,50,4,50,6,50,8,50,7,50,6,50,8,4};
		System.out.println(majority(arr));
		System.out.println("length = "+arr.length);

	}

}
