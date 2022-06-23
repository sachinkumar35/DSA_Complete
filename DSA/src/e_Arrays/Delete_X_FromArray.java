package e_Arrays;

public class Delete_X_FromArray {

	public static int deleteX(int arr[], int n, int x) {
		int i;
		for(i=0;i<n;i++) {
			if(arr[i]==x)
				break;
		}
		if(i==n) return n;
		for(int j=i; j<n-1; j++) {
			arr[j]= arr[j+1];
		}
		return n-1;
	}
	public static void main(String[] args) {
		
		int arr[] = {4,3,88,34,23,11,45};
		int n = arr.length;	
		int x = 3;
		
		System.out.println("Before Deletion...!");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
		n=deleteX(arr, n, x);
		
		System.out.println("\nAfter Deletion...!");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
	}
}
