package f_Searching;

public class Search_Element_in_Infinite_SortedArray {

	public static int search(int arr[], int x) {
		int i =0;
		while(true)
		{
			if(arr[i]==x)
				return i;
			if(arr[i]>x)
				return -1;
			i++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,12,13,23,34,54,56,67,89,100,199,200,288,387};
		int x = 54;
		System.out.println(search(arr, x));
	}
}
