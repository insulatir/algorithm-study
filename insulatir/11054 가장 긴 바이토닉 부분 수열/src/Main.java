import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] array = new int[n];
		int[][] len = new int[2][n];
		int[] lens = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (len[0][i] == 0) {
				len[0][i] = 1;
			}					
			
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j]) {
					if (len[0][i] < len[0][j] + 1) {
						len[0][i] = len[0][j] + 1;
					}
				}
			}
		}
		
		for (int i = n - 1; i >= 0; i--) {
			if (len[1][i] == 0) {
				len[1][i] = 1;
			}
			
			for (int j = n - 1; j > i; j--) {
				if (array[i] > array[j]) {
					if (len[1][i] < len[1][j] + 1) {
						len[1][i] = len[1][j] + 1;
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			lens[i] = len[0][i] + len[1][i] - 1;
		}
		
		Arrays.sort(lens);
		
		System.out.println(lens[lens.length-1]);
		
		scan.close();
	}

}
