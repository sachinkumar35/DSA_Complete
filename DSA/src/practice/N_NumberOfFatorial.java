package practice;

import java.util.ArrayList;

public class N_NumberOfFatorial {
	
	
	public static void factorial(int n) {
		int[] fact = new int[500];
		fact[0] = 1;
		if(n==0 || n==1) {
			System.out.println(1);
			return;
		}
		for(int i=2; i<n; i++)
		{
			int carry = 0;
			for(int j=0; j<fact.length; j++) {
				int temp = carry;
				carry = (fact[j]*i + carry)/10;
				fact[j]=(fact[j]*i + temp)%10;
				
			}
			while(carry != 0) {
				fact[i]=carry%10;
				i++;
				carry /=10;
			}
		}
		
		for(int i=0; i<n; i++)
			System.out.print(fact[i]+" ");
	}
	
	public static void main(String[] args) {
		int n = 5;
		factorial(n);
		
	}
}
