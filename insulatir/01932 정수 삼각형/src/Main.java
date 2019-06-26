import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] tri = new int[n][n];
		int[][] sum = new int[n][n];
		int m = 0;
		
		bw.flush();
		bw.close();
	}

}
