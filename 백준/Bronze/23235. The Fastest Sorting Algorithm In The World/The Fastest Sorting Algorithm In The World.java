import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while (true) {
			if (br.readLine().charAt(0) == '0') {
				break;
			}
			count++;
			sb.append("Case " + count + ": Sorting... done!\n");
		}
		
		System.out.println(sb);
	}
}
