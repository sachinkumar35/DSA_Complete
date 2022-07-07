package f_Searching;

public class Repeating_Element_2_Efficient {
	
	public static int repeat(int arr[]) {
		boolean temp[] = new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			if(temp[arr[i]])
				return arr[i];
			temp[arr[i]] = true;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {0,2,1,3,2,4};
		System.out.println(repeat(arr));

	}

}
