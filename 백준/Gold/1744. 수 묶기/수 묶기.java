import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		PriorityQueue<Integer> plusQ = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minusQ = new PriorityQueue<>();
		int one = 0;
		int zero = 0;
		
		for (int i=0;i<N; i++) {
			int data = Integer.parseInt(br.readLine());
			if (data > 1) {
				plusQ.add(data);
			} else if (data == 1) {
				one++;
			} else if (data == 0) {
				zero++;
			} else minusQ.add(data);
		}
		
		int sum = 0;
		
		// 양수 처리하기 
		while (plusQ.size() > 1) {
			int first = plusQ.remove();
			int second = plusQ.remove();
			sum += first * second;
		}
		
		if (!plusQ.isEmpty()) {
			sum += plusQ.remove();
		}
		
		// 음수 처리 
		while (minusQ.size() > 1) {
			int first = minusQ.remove();
			int second = minusQ.remove();
			sum += first*second;
		}
		
		if (!minusQ.isEmpty()) {
			if (zero == 0) {
				sum = sum + minusQ.remove();
			}
		}
		
		sum = sum+one;
		System.out.println(sum);
	}
}