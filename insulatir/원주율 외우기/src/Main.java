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
		
		return cache[begin];
	}
	
	public static int classify(int a, int b) {
		String M = N.substring(a, b+1);
		
		String Ms = "";
		for (int i = 0; i < M.length(); i++) {
			Ms += Character.toString(M.charAt(0));
		}
		if (M.equals(Ms)) {
			return 1;
		}
		
		boolean progressive = true;
		for (int i = 0; i < M.length()-1; i++) {
			if ((int) M.charAt(i+1) - (int) M.charAt(i) != (int) M.charAt(1) - (int) M.charAt(0)) {
				progressive = false;
			}
		}
		if (progressive && Math.abs((int) M.charAt(1) - (int) M.charAt(0)) == 1) {
			return 2;
		}
		
		boolean alternating = true;
		for (int i = 0; i < M.length(); i++) {
			if (M.charAt(i) != M.charAt(i%2)) {
				alternating = false;
			}
		}
		if (alternating) {
			return 4;
		}
		
		if (progressive) {
			return 5;
		}
	}
}
