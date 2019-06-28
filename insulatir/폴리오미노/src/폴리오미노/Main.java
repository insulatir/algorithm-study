package 폴리오미노;
import java.util.*;
public class Main {
	static int[][] cache = new int[101][101];
	static int MOD = 10000000;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int i = 0; i < C; i++) {
			int n = scan.nextInt();
			
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 101; k++) {
					cache[j][k] = -1;
				}
			}
			
			int result = 0;
		}
		
		scan.close();
	}

	public static int poly(int n, int first) {
		if (n == first) {
			return 1;
		}
		
		if (cache[n][first] != -1) {
			return cache[n][first];
		}
		
		cache[n][first] = 0;
		for (int second = 1; second <= n-first; second++) {
			int add = second + first - 1;
			add *= poly(n - first, second);
			add %= MOD;
			cache[n][first] += add;
			cache[n][first] %= MOD;
		}
		
		return cache[n][first];
	}
}
