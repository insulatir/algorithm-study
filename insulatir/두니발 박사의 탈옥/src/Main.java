import java.util.*;
public class Main {
	static int n, d, p, q;
	static int[] deg = new int[51];
	static int[][] connected = new int[51][51];
	static double[][] cache = new double[51][101];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		for (int i = 0; i < c; i++) {
			n = scan.nextInt();
			d = scan.nextInt();
			p = scan.nextInt();
			
			for (int j = 0; j < 51; j++) {
				deg[j] = 0;
			}
			
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					connected[j][k] = scan.nextInt();
					if (connected[j][k] == 1) {
						deg[j] += 1;
					}
				}
			}
			
			for (int j = 0; j < 51; j++) {
				for (int k = 0; k < 101; k++) {
					cache[j][k] = -1;
				}
			}
			
			int t = scan.nextInt();
			for (int j = 0; j < t; j++) {
				q = scan.nextInt();
			}
		}
		
		scan.close();
	}

	public static double search(int here, int days) {
		if (days == 0) {
			return (here == p ? 1.0 : 0.0);
		}
		
		if (cache[here][days] > -0.5) {
			return cache[here][days];
		}

		cache[here][days] = 0.0;
		for (int there = 0; there < n; there++) {
			if (connected[here][there] == 1) {
				cache[here][days] += search(there, days-1) / deg[there];
			}
		}
	}
}
