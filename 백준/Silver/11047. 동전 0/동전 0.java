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
		
		int[] A = new int[N];
		int result = 0;
		
		for (int i=0; i<N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i=N-1; M!=0; i--) {
			if (M >= A[i]) {
				result += M/A[i];
				M%=A[i];
			}
		}
		System.out.println(result);
	}
}