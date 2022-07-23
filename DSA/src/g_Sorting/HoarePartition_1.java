package g_Sorting;

public class HoarePartition_1 {

	public static int hoare(int arr[], int l, int h)
	{
		int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,3,8,4,2,7,1,10};
		int l=0, h=arr.length;
		
		hoare(arr, l, h-1);
		
//		int j = hoare(arr, l, h-1);
		
//		for(int i=l; i<=j; i++)
//			System.out.print(arr[i]+" ");
//		System.out.println();
		
		for(int print : arr)
			System.out.print(print+" ");

	}

}
