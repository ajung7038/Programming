import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		// 큐에 1~N까지의 값 넣기 
		for (int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		int temp; // 임시 저장 변수 
		
		while (queue.size() != 1) {
			queue.remove();
			// 제일 아래로 옮기기 
			temp = queue.poll();
			queue.add(temp);
		}
		
		System.out.println(queue.poll());
	}
}
