import java.util.*;
public class Main {
	static int n;
	static int[] S = new int[1000];
	static int[] cache = new int[1001];
	static int[] choices = new int[1001];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		
		for (int i = 0; i < 1001; i++) {
			cache[i] = -1;
			choices[i] = -1;
		}
		
		scan.close();
	}
	
	public static int lis(int start) {
		if (cache[start+1] != -1) {
			return cache[start+1];
		}
	}

}
