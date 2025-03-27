import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		long start = 1, end = K;
		long ans = 0;
		
		// 이진 탐색 수행
		while (start <= end) {
			long middle = (start + end) / 2;
			long cnt = 0;
			// 중앙값보다 작은 수가 몇 개인지 계산
			for (int i=1; i<=N; i++) {
				cnt += Math.min(middle/i, N);
			}
			if (cnt < K) {
				start = middle + 1;
			} else {
				ans = middle;
				end = middle - 1;
			}
		}
		System.out.println(ans);
	}
}