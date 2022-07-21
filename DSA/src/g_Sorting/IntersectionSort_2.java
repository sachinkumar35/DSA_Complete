package g_Sorting;

public class IntersectionSort_2 {

	public static void intersection(int a[], int[] b)
	{
		int i=0, j=0;
		
		while(i<a.length && j<b.length)
		{
			if(i>0 && a[i]==a[i-1])
				{ i++; continue;}
			if(a[i]<b[j])
				i++;
			else if(a[i]>b[j])
				j++;
			else 
			{
				System.out.print(a[i]+" ");
				i++; j++;
			}
		}
	}
	public static void main(String[] args) {
		int arr1[] = {3,5,10,10,10,15,15,20};
		int arr2[] = {5,10,10,15,30};
		
		intersection(arr1, arr2);
	}
}
