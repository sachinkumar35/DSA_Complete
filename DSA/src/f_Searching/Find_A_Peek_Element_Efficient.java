package f_Searching;

public class Find_A_Peek_Element_Efficient {
	public static int getPeek(int arr[]) {
		
		int low =0, high = arr.length-1;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(mid==0 || arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1] || mid == arr.length-1 )
				return arr[mid];
			else 
				if(mid>0 && arr[mid]<arr[mid-1])
					high=mid-1;
				else 
					low = mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[]= {22,6,34,36,2,6,75,350,676};
		System.out.println(getPeek(arr));

	}

}
