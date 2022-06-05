package mathematicsPractice;

public class Series_9_33_73_print {

	void series(int n) {
		
		for(int i=1; i<=n; i++)
		System.out.println((8*i*i)+1);
	}
	public static void main(String[] args) {
		Series_9_33_73_print obj = new Series_9_33_73_print();
		
		obj.series(10);

	}

}
