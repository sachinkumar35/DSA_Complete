package f_Searching;

public class Median_Of_Two_Sorted_Array {

	public static float median(int arr1[], int arr2[]) {
		
		int arr1Size = arr1.length;
		int arr2Size = arr2.length;
		int n=-1, count=0, count1=0;
		float arr3[] = new float[arr1Size+arr2Size];
		
		for(int i=0; i<arr3.length; i++)
		{
			if(arr1Size-1 > count)
			arr3[i] = arr1[count];
			
			else if(n==-1 && (arr1Size-1 == count)) {
				arr3[i]=arr1[count];
				n=1;
			}
			if(arr1Size-1 == count) {
				count--;
			}
			count++;
			
			if(i>arr1Size-1)
			{ 
				arr3[i] = arr2[count1];
				count1++;
			}		
		}
		
		int m = arr3.length/2;
		if(arr3.length%2==0)
			return (arr3[m-1]+arr3[m])/2;
		else
			return arr3[m];
			
	}

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10};
		
		System.out.println(median(arr1, arr2));

	}

}
