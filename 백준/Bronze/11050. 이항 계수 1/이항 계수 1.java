import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		dp = new int[N+1][M+1];
		
		System.out.println(BC(N, M));
	}
	
	static int BC(int n, int m) {
		// 이미 풀었을 경우 dp 값 활용
		if (dp[n][m] > 0) {
			return dp[n][m];
		}
		if (m==0 || n==m) {
			return dp[n][m]=1;
		}
		
		return dp[n][m] = BC(n-1, m-1) + BC(n-1, m);
	}
}