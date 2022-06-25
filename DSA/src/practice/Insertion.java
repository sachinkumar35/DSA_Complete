package practice;

public class Insertion {
	public static int insert(int arr[], int x, int cap, int posi,int n) {
		if(n==cap) return n ;
		int ind = posi-1;
		for(int i=n-1; i>=ind; i--) {
			arr[i+1]=arr[i];
		}
		arr[ind]=x;
		return n+1;
	}
	public static void main(String[] args) {
		int n=3;
		int arr[] = new int[5];
		arr[0] = 45; arr[1]=6; arr[2]=76;
		
		int z= insert(arr, 50, 5 , 2,n);
		for(int i=0; i<z; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
