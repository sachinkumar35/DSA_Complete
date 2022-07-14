package practice;

		/* Input:
		N  = 7
		A[] = {20, 8, 22, 4, 12, 10, 14}
		K1 = 3, K2 = 6
		Output:
		26
		Explanation:
		3rd smallest element is 10
		6th smallest element is 20
		Element between 10 and 20 
		12,14. Their sum = 26.
		*/

import java.util.Arrays;

public class SumOfElements_bw_k1andk2th_SmallestElements {
	public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        Arrays.sort(A);
        int sum=0;
        for(int i=(int) K1; i<K2-1; i++){
            // if(A[(int) K1-1]<A[i] && A[(int) K2-1]>A[i])
                sum+=A[i];
        }
        return sum;
    }
	public static void main(String[] args) {
		long[] arr = {20,8,22,4,12,10,14};
		long n = arr.length, k1=3, k2=6;
		
		long result = sumBetweenTwoKth(arr, n, k1, k2);
		
		System.out.println(result);

	}

}
