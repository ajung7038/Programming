import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] size = new int[6];
		StringBuilder sb = new StringBuilder();
		
		// 티셔츠 사이즈 기입
		for (int i=0; i<6; i++) {
			size[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int TCount = 0;
		
		// 티셔츠 묶음 계산 
		for (int i=0; i<6; i++) {
			if (size[i]%T == 0) TCount += size[i]/T;
			else TCount += (size[i] / T)+1;
		}
		sb.append(TCount+"\n");
		
		// 펜 묶음 계산 
		sb.append(N/P + " " + N%P);
		System.out.println(sb);
	}
}