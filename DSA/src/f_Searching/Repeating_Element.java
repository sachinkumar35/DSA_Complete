package f_Searching;

public class Repeating_Element {

	public static int repeat(int arr[]) {
		for(int i=0; i<arr.length; i++) 
			for(int j=i+1; j<arr.length; j++)
				if(arr[i]==arr[j])
					return arr[i];
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {0,2,1,3,2,2};
		System.out.println(repeat(arr));

	}

}
