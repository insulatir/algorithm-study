import java.util.Scanner;

public class Main {
	static int[][] board = new int[100][100];
	static long[][] cache = new long[100][100];
	static int n = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
				cache[i][j] = -1;
			}
		}
		
		scan.close();
	}

	public static long jump(int y, int x) {
		if (y >= n || x >= n) {
			return 0;
		}
		if (y == n-1 && x == n-1) {
			return 1;
		}
	}
}
