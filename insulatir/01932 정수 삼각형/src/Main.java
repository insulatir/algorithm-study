import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] tri = new int[n][n];
		int[][] sum = new int[n][n];
		int m = 0;
		
		for(int i = 0; i < n; i++) {
			String[] array = br.readLine().split(" ");
			for(int j = 0; j <= i; j++) {
				tri[i][j] = Integer.parseInt(array[j]);
			}
		}
		
		sum[0][0] = tri[0][0];
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0) {
					sum[i][j] += sum[i-1][j] + tri[i][j];
				} else if(j == i) {
					sum[i][j] += sum[i-1][j-1] + tri[i][j];
				} else {
					sum[i][j] += Math.max(sum[i-1][j], sum[i-1][j-1]) + tri[i][j];
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(m < sum[n-1][i]) {
				m = sum[n-1][i];
			}
		}
		
		bw.write(m + "");
		bw.flush();
		bw.close();
	}

}
