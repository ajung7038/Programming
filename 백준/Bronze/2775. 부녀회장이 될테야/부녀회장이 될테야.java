import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		int[] k = new int[T];
		int[] n = new int[T];
		
		// 거주자 수 파악
		int maxK = 0;
		int maxN = 0;
		for (int i=0; i<T; i++) { 
			k[i] = Integer.parseInt(br.readLine());
			n[i] = Integer.parseInt(br.readLine());
			if (maxK < k[i]) maxK = k[i];
			if (maxN < n[i]) maxN = n[i];
		}
		
		int[][] house = new int[maxK+1][maxN]; // 층수는 0부터 시작 
		
		for (int i=0; i<=maxK; i++) {
			house[i][0] = 1;
			for (int j=1; j<maxN; j++) {
				if (i==0) house[i][j]=j+1;
				else house[i][j] = house[i][j-1] + house[i-1][j];
			}
		}
		
		int j=0;
		for (int i=0; i<T; i++) {
			sb.append(house[k[j]][n[j]-1]).append("\n");
			j++;
		}
		
		System.out.println(sb);
	}
}
