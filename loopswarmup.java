public class loopswarmup {
	public static void main(String[] args) {
		//warmUp0(5);
		warmUp1(2,3);
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
}