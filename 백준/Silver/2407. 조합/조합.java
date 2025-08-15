import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	static int n=0, m=0;
	static BigInteger[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		dp = new BigInteger[n+1][m+1];
		
		System.out.println(combi(n, m));
	}
	
	private static BigInteger combi(int n, int m) {
		if (dp[n][m] == null) {
			if (n==m || m == 0) return dp[n][m] = BigInteger.valueOf(1);
			return dp[n][m] = combi(n-1, m).add(combi(n-1, m-1));
		}
		return dp[n][m];
	}
}
