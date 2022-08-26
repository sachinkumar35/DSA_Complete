package i_Hashing;

public class Uninon_Naive {
	static int y=0;
	static int union(int a[], int b[]) {
		int res =0; 
		int dist[] = new int[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			boolean flag = false;
			for(int j=0; j<i; j++) {
				if(a[i]==a[j]) {
					flag = true;
					break;
				}
			}
			if(flag == true)
				continue;
			
			dist[y++]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			boolean flag = false;
			for(int j=0; j<dist.length; j++) {
				if(b[i]==dist[j]) {
					flag = true;
					break;
				}
			}
			if(flag == true)
				continue;
	
			dist[y++]=b[i];
		}

		for(int i=0; dist[i]!=0; i++)
			res++;
		return res;
			
	}
	public static void main(String[] args) {
		int a[] = {10,20,10,20,20,30,40,90,60,20};
		int[] b = {20,30,20,20,40,40,50,10,10};
		
		System.out.println(union(a, b));

	}

}
