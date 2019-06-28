import java.util.*;
public class Main {
	static int n;
	static int[] S = new int[1000];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		
		scan.close();
	}

}
