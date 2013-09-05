public class loopswarmup {
	public static void main(String[] args) {
		//warmUp0(5);
		//warmUp1(2,3);
		warmUp2(5);
	}
	public static void warmUp0(int n) {
		
		int total = 0;
		while (n >= 1) {
			System.out.println(n);
			total = total + n;
			n = n-1;
			

		}
		System.out.println(total);
	}
	public static void warmUp1(int x, int n) {
		int total=x;
		while (n >= 1) {
			System.out.println(total);
			total = total*x;
			n--;
		}
	}
	public static void warmUp2(int n) {
		int total = n;
		// while (n >= 2) {
		// 	System.out.println(n);
		// 	n--;
		// 	total = total*(n);
			
		// }
		// System.out.println(total);
		for (int i=n; n>=2;n-- ) {
			System.out.println(n);
			total = total*(n-1);
		}
		System.out.println(total);
	}
}