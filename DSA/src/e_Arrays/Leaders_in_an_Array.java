package e_Arrays;

//An array is called leader? if there is nothing which is greater than this element on right side of it.
public class Leaders_in_an_Array {
	
	static void leader(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean flage = true;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<=arr[j]) 
				{
					flage = false;
					break;
				}
			}
			if(flage==true) System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,20,10,20,14,12,5,2,3};
		leader(arr);
	}

}
