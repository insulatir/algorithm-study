package insulatir;

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
				
			}
		}
		
		scan.close();
	}

}
