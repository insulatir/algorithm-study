import java.util.*;
public class Main {
	static int[][] cache = new int[101][101];
	static String W, S;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		W = scan.next();
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			S = scan.next();
			for (int j = 0; j < 101; j++) {
				for (int k = 0; k < 101; k++) {
					cache[j][k] = -1;
				}
			}
		}
		
		scan.close();
	}

	
	public static boolean match(int w, int s) {
		if (cache[w][s] != -1) {
			if (cache[w][s] == 1) {
				return true;
			} else {
				return false;
			}
		}
		
		while (s < S.length() && w < W.length() && (W.charAt(w) == S.charAt(s))) {
			if (match(w+1, s+1)) {
				cache[w][s] = 1;
				return true;
			} else {
				cache[w][s] = 0;
				return false;
			}
		}
		
		if (w == W.length()) {
			if (s == S.length()) {
				cache[w][s] = 1;
				return true;
			} else {
				cache[w][s] = 0;
				return false;
			}
		}
		if (W.charAt(w) == '*') {
			if (match(w+1, s) || (s < S.length() && match(w, s+1))) {
				cache[w][s] = 1;
				return true;
			}
		}
	}
}
