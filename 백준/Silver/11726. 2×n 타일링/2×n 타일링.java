import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		// dp[1]부터 시작하면 n=1이 들어왔을 때 dp[2] 저장 과정에서 오류 발생 
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i=2; i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2])%10007;
		}
		
		System.out.println(dp[n]);
	}
}