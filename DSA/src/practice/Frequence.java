package practice;

public class Frequence {

	public static void freq(int arr[])
	{
		int count = 1; 
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]==arr[i-1])
				count++;
			else
			{
				System.out.println(arr[i-1]+ " = "+ count);
				count=1;
			}	
		}
		System.out.println(arr[arr.length-1]+" = "+ count);
	}
	public static void main(String[] args) {
		int arr[]= {10,11};
		freq(arr);

	}

}
