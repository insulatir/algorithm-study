import java.util.*;
public class Main {
	static int n = 0;
	static int[] A;
	static int[][] cache = new int[101][11];
	static int[] pSum = new int[101];
	static int[] pSqSum = new int[101];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int i = 0; i < C; i++) {
			n = scan.nextInt();
			int S = scan.nextInt();
			A = new int[n];
			for (int j = 0; j < n; j++) {
				A[j] = scan.nextInt();
			}
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 11; k++) {
					cache[j][k] = -1;
				}
			}
		}
		
		scan.close();
	}
}
