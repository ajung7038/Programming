import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
 
		for (int i= 0; i<n; i++) {
			arr[i] = br.readLine();
		}
 
		for (int i=0; i<n; i++) {
			int count = 0;
			int sum = 0;
			for (int j=0; j<arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count=0;
				}
				sum+=count;
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);
	}
}