import java.util.*;
public class Main {
	static int n;
	static int m;
	static double[][] cache = new double[1000][2001];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int i = 0; i < C; i++) {
			n = scan.nextInt();
			m = scan.nextInt();
			
			for (int j = 0; j < 1000; j++) {
				for (int k = 0; k < 2001; k++) {
					cache[j][k] =  -1;
				}
			}
		}
		
		scan.close();
	}

}
