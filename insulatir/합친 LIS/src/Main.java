import java.util.*;
public class Main {
	static int n;
	static int m;
	static long[] A = new long[100];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		for (int i = 0; i < c ; i++) {
			n = scan.nextInt();
			m = scan.nextInt();
			for (int j = 0; j < n; j++) {
				A[j] = scan.nextLong();
			}
		}
		
		scan.close();
	}

}
