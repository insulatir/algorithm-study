import java.util.*;
public class Main {
	static int n;
	static int m;
	static long[] A = new long[100];
	static long[] B = new long[100];
	static int[][] cache = new int[101][101];
	static long NEGINF = Long.MIN_VALUE;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		for (int i = 0; i < c ; i++) {
			n = scan.nextInt();
			m = scan.nextInt();
			for (int j = 0; j < n; j++) {
				A[j] = scan.nextLong();
			}
			for (int j = 0; j < m; j++) {
				B[j] = scan.nextLong();
			}
			for (int j = 0; j < cache.length; j++) {
				for (int k = 0; k < cache.length; k++) {
					cache[j][k] = -1;
				}
			}
			
			
		}
		
		scan.close();
	}

	public static int jlis(int indexA, int indexB) {
		if (cache[indexA+1][indexB+1] != -1) {
			return cache[indexA+1][indexB+1];
		}
		cache[indexA+1][indexB+1] = 2;
		
		long a = (indexA == -1 ? NEGINF : A[indexA]);
		long b = (indexB == -1 ? NEGINF : B[indexB]);
		long maxElement = Long.max(a, b);
	}
}
