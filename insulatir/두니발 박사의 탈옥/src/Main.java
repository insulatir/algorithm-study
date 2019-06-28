import java.util.*;
public class Main {
	static int n, d, p;
	static int[] deg = new int[51];

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
		}
		
		scan.close();
	}

}
