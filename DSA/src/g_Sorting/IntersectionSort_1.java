package g_Sorting;

public class IntersectionSort_1 {

	public static void intersection(int a[], int b[])
	{
		int n = a.length;
		int m = b.length;
		
		for (int i=0; i<n; i++) {
			if(i>0 && a[i]==a[i-1])
				continue;
			for(int j=0; j<m; j++)
				if(a[i]==b[j])
					{
						System.out.print(a[i]+" ");
						break;
					}
		}
		
	}
	public static void main(String[] args) {
		int arr1[] = {3,5,10,10,10,15,15,20};
		int arr2[] = {5,10,10,15,30};
		
		intersection(arr1, arr2);
		
		}

}
