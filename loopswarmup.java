public class loopswarmup {
	public static void main(String[] args) {
		warmUp0(5);
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
}