import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[][] array = new int[N + 1][K + 1];
		
		array[0][0] = 1;
		for (int j = 1; j <= K; j++) {
			for (int i = 0; i <= N; i++) {
				for (int k = 0; k <= i; k++) {
					array[i][j] = (array[i][j] + array[k][j-1]) % 1000000000;
				}
			}
		}
		
		System.out.println(array[N][K]);
		
		scan.close();
	}

}
