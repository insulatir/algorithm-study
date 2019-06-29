import java.util.*;
public class Main {
	static int n;
	static int capacity;
	static int[] weight = new int[100];
	static int[] value = new int[100];
	static int[][] cache = new int[100001][1001];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		capacity = scan.nextInt();
		for (int i = 0; i < n; i++) {
			weight[i] = scan.nextInt();
			value[i] = scan.nextInt();
		}
		
		for (int i = 0 ; i < 100001; i++) {
			for (int j = 0; j < 1001; j++) {
				cache[i][j] = -1;
			}
		}
		
		scan.close();
	}

	public static int pack(int capacity, int item) {
		
	}
}
