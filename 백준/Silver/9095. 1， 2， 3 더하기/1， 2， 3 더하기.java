import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	private static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(DP(n)).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int DP (int n) {
		if (dp[n] > 0) return dp[n];
		return dp[n] = DP(n-3) + DP(n-2) + DP(n-1);
	}
}
