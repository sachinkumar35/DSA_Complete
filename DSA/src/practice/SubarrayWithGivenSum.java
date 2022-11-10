package practice;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();

        int cs=0,j=0;
        for(int i=0; i<=n; i++) {
        	while(cs > sum && j<i-1) {
        		cs -= arr[j++];
        		
        	}
        	if(cs==sum) {
        		list.add(j+1);
        		list.add(i);
        		return list;
        	}
        	if(i<n) {
        		cs += arr[i];
        	}
        }
        l.add(-1);
        	return l;
    }
	public static void main(String[] args) {
		int arr[]= {1,2,3,7,5,7};
		int sum = 19;
		int n = arr.length;
		System.out.println(subarraySum(arr, n, sum));

	}

}
