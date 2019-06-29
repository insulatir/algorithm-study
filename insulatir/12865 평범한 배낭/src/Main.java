import java.util.*;
public class Main {
	static int n;
	static int capacity;
	static int[] weight = new int[100];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		capacity = scan.nextInt();
		for (int i = 0; i < n; i++) {
			weight[i] = scan.nextInt();
		}
		
		scan.close();
	}

}
