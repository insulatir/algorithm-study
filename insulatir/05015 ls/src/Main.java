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

}
