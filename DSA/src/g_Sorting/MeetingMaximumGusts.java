package g_Sorting;

import java.util.Arrays;

public class MeetingMaximumGusts {
	
	public static int meetingGuests(int arr[], int dep[])
	{
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i=1, j=0, res=1, count=1; 
		
		while(i<arr.length && j<arr.length)
		{
			if(arr[i]<=dep[j])
				{ i++; count++; }
			else
				{ count--; j++; }
			res = Math.max(res, count);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {900,600,700};
		int[] dep = {1000,800,730};
		
		System.out.println(meetingGuests(arr, dep));

	}

}
