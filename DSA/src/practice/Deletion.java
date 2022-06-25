package practice;

public class Deletion {

	public static int delete(int arr[], int x) {
		int i;
		for( i=0; i< arr.length; i++) {
			if(arr[i]==x) break;
		}
		if(i==arr.length)
			return arr.length;
		for(int j=i; j<arr.length-1; j++) {
			arr[j]=arr[j+1];
		}
		return arr.length-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40};
		int x=20;
		int n =delete(arr, x);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
