import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int even = 0;
		int odd = 0;
		int L = 0;
		int R = 0;
		
		
		if (arr[0]%2 == 0) even++;
		else odd++;
		int ans = even;
		
		while (R < n) {
			if (odd > k) {
				if (arr[L]%2 == 0) even--;
				else odd--;
				L++;
			} else {
				if (R == n-1) break;
				R++;
				if (arr[R]%2 == 0) even++;
				else odd++;
				ans = Math.max(ans, even);

			}
		}
		
		System.out.println(ans);
	}
}
