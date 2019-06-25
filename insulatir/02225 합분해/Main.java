import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[][] array = new int[N + 1][K + 1];
		
		array[0][0] = 1;
		
		scan.close();
	}

}
