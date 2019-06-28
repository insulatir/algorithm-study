import java.util.*;
public class Main {
	static int n;
	static int[][] triangle = new int[100][100];
	static int[][] cache = new int[100][100];
	static int[][] countCache = new int[100][100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int k = 0; k < C; k++) {
			n = scan.nextInt();
		
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					triangle[i][j] = scan.nextInt();
				}
			}
			
			for (int i = 0 ; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					cache[i][j] = -1;
					countCache[i][j] = -1;
				}
			}
		}
		
		scan.close();
	}

	public static int path(int y, int x) {
		if (y == n-1) {
			return triangle[y][x];
		}
		
		if (cache[y][x] != -1) {
			return cache[y][x];
		}
		
		cache[y][x] = Math.max(path(y+1, x), path(y+1, x+1)) + triangle[y][x];
		return cache[y][x];
	}
	
	public static int count(int y, int x) {
		if (y == n-1) {
			return 1;
		}
		
		if (countCache[y][x] != -1) {
			return countCache[y][x];
		}
	}
}
