import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "mixed";
		int tmp, count; // isAscending = 0이면 descending
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		if (start == 8) {
			for (int i=7; i>0; i--) {
				if (i != Integer.parseInt(st.nextToken())) break;
				if (i == 1) result="descending";
			}
		}
		else if (start == 1) {
			for (int i=2; i<9; i++) {
				if (i != Integer.parseInt(st.nextToken())) break;
				if (i == 8) result="ascending";
			}
		}
		System.out.println(result);
	}
}