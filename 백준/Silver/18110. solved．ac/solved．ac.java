import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if (N==0) {
			System.out.println(0);
			return;
		}
		
		int[] arr = new int[N];
		
		// 배열에 값 채우기 
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int ex = (int) Math.round(N * 0.15); // 제외할 사람 수 
		
		int sum = 0;
		for (int i=ex; i<N-ex; i++) {
			sum += arr[i];
		}
		
		System.out.println((int) Math.round( (double) sum/(N-ex*2)));
	}
}