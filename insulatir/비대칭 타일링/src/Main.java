import java.util.*;
public class Main {
	static int[] cache = new int[101];
	static int[] cache2 = new int[101];
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int i = 0; i < C; i++) {
			int n = scan.nextInt();
		
			for (int j = 0; j < 101; j++) {
				cache[j] = -1;
				cache2[j] = -1;
			}
		}
		
		scan.close();
	}

	public static int tiling(int width) {
		if (width <= 1) {
			return 1;
		}
		
		if (cache[width] != -1) {
			return cache[width];
		}
		return cache[width] = (tiling(width-2) + tiling(width-1)) % MOD;
	}
	
	public static int asymmetric(int width) {
		if (width % 2 == 1) {
			return (tiling(width) - tiling(width/2) + MOD) % MOD;
		}
		
		int ret = tiling(width);
		ret = (ret - tiling(width/2) + MOD) % MOD;
		ret = (ret - tiling(width/2-1) + MOD) % MOD;
		return ret;
	}
	
	public static int asymmetric2(int width) {
		if (width <= 2) {
			return 0;
		}
		
		if (cache2[width] != -1) {
			return cache2[width];
		}
		
		cache2[width] = asymmetric2(width-2) % MOD;
		cache2[width] = (cache2[width] + asymmetric2(width-4)) % MOD;
		cache2[width] = (cache2[width] + tiling(width-3)) % MOD;
		cache2[width] = (cache2[width] + tiling(width-3)) % MOD;
		return cache2[width];
	}
}
