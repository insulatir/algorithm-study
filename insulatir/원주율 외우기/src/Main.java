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
		
	}
}
