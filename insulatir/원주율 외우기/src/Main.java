import java.util.*;
public class Main {
	static String N;
	static int[] cache = new int[10002];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int i = 0; i < C; i++) {
			N = scan.next();
		}
		
		for (int j = 0; j < cache.length; j++) {
			cache[j] = -1;
		}
		
		scan.close();
	}

	public static int memorize(int begin) {
		if (begin == N.length()) {
			return 0;
		}
		
		if (cache[begin] != -1) {
			return cache[begin];
		}
		
		cache[begin] = INF;
		for (int L = 3; L <= 5; L++) {
			if (begin + L <= N.length()) {
				cache[begin] = Math.min(cache[begin], memorize(begin + L) + classify(begin, begin + L - 1));
			}
		}
	}
}
