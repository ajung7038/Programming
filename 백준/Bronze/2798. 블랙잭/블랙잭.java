import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int max=0;
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i=0; i<N; i++) {
			for (int j=1; j<N; j++) {
				if (i==j) continue;
				for (int k=2; k<N; k++) {
					if (j==k || i==k) continue;
					int sum = arr[i] + arr[j] + arr[k];
					if (sum <= M && max < sum) max = sum;
				}
			}
		}
		
		System.out.println(max);
	}
}
