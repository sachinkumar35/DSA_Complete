package practice;

public class Leader {

	static void leader(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int flage=0;
			for(int j=i+1; j<arr.length; j++)
				if(arr[i]<=arr[j])
					{flage=1;break;}
			if(flage==0)
				System.out.print(arr[i]+" ");
					
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,10,4,6,5,4,3,2,3,1};
		leader(arr);

	}

}
