import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String str = br.readLine();
			boolean isPal=true;
			if (str.charAt(0) == '0') break;
			int len = str.length();
			
			for (int i=0; i<len/2; i++) {
				if (str.charAt(i) != str.charAt(len-i-1)) isPal=false;
			}
			if (isPal) sb.append("yes\n");
			else sb.append("no\n");
		}
		System.out.println(sb);
	}
}