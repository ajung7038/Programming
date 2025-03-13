import java.util.PriorityQueue;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> {
			int first_abs = Math.abs(o1);
			int second_abs = Math.abs(o2);
			if (first_abs == second_abs) {
				return Integer.compare(o1, o2);
			} else {
				return Integer.compare(first_abs, second_abs);
			}
		});
		
		for (int i=0; i<N; i++) {
			int request = Integer.parseInt(br.readLine());
			if (request==0) {
				if(queue.isEmpty()) {
					System.out.println("0");
				} else {
				System.out.println(queue.poll());
				}
			} else {
				queue.add(request);
			}
		}
	}
}
