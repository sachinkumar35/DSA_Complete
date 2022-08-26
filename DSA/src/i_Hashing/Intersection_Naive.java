package i_Hashing;

public class Intersection_Naive {

	static int intersect(int a[], int b[]) {
		int res = 0;
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
			
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					res++;
					break;
				}
			}
		}
		return res;
	
	}
	
	public static void main(String[] args) {
		int a[] = {10,20,10,20,20,30,40};
		int[] b = {20,30,20,20,40,40,50};
		
		System.out.println(intersect(a, b));

	}

}
