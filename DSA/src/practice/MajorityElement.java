package practice;

public class MajorityElement {
	
	static int findMajority(int arr[])
	{
		int count=1, res=0;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]==arr[res])
				count++;
			else 
				count--;
			if(count==0)
			{
				res=i;
				count=1;
			}
		}
		count =0;
			for(int i=0; i<arr.length; i++) {
				if(arr[res]==arr[i])
					count++;
			}
			if(count<=arr.length/2)
				return -1;
			return res;
		}
		
	public static void main(String[] args) {
		int arr[] = {8,3,4,8,8,5,6,7};
		System.out.println(findMajority(arr));
	}

}
