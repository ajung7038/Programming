import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long sum = 0;
		long pow=1;
		
		for (int i=0; i<N; i++) {
			sum += ((str.charAt(i) - 96) * pow);
			pow = (pow * 31) % 1234567891;
		}
		System.out.println(sum % 1234567891);
	}
}
