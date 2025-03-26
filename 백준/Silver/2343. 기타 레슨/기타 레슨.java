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
		
		int[] a = new int[N];
		int start = 0;
		int end = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if (start < a[i]) start = a[i]; // 레슨 최댓값을 시작 인덱스로 저장 
			end = end + a[i]; // 모든 레슨의 총합
		}
		
		while (start <= end) {
			int middle = (start + end) / 2;
			int sum = 0;
			int count = 0;
			for (int i=0; i<N; i++) {
				if (sum + a[i] > middle) {
					count++;
					sum = 0;
				}
				sum = sum + a[i];
			}
			
			if (sum != 0) {
				count++;
			}
			if (count > M) {
				start = middle + 1;
			} else end = middle -1;
		}
		System.out.println(start);
	}
}
