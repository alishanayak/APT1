public class Totality {
	public int sum(int[] a, String stype) {
		
		int i = 0;
		int inc = 0;
		
		if (stype.equals("odd")) {
			i = 1;
			inc = 2;
		} else if (stype.equals("even")) {
			inc = 2;
		} else {
			inc = 1;
		}
		
		int sum = 0;
		
		while (i < a.length) {
			sum = sum + a[i];
			i = i + inc;
		}
		
		return sum;
	}
}