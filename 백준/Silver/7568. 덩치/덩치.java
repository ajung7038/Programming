import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] person = new int[N][2];
		
		// 몸무게, 키 저장
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			person[i][0] = Integer.parseInt(st.nextToken());
			person[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 덩치 비교
		for (int i=0; i<N; i++) {
			int count = 1;
			for (int j=0; j<N; j++) {
				if (i != j && person[i][0] < person[j][0] && person[i][1] < person[j][1]) count++;
			}
			sb.append(count).append(" ");
		}
		
		System.out.println(sb);
	}
}