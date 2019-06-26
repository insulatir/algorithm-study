import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] array = new int[n];
		int[] len = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		
		scan.close();
	}

}
