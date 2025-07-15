import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static int[][] dp = new int[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			sb.append(DP(m, n)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int DP(int m, int n) {
		if (dp[m][n] > 0) return dp[m][n];
		
		if (n==m || n==0) return dp[m][n] = 1;
		
		return dp[m][n] = DP(m-1, n-1) + DP(m-1, n);
	}
}
