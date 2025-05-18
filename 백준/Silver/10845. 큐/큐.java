import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			
			switch(command) {
			case "push":
				dq.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else sb.append(dq.remove()).append("\n");
				break;
			case "size":
				sb.append(dq.size()).append("\n");
				break;
			case "empty":
				sb.append(dq.isEmpty() ? 1 : 0).append("\n");
				break;
			case "front":
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else sb.append(dq.peek()).append("\n"); // peekFirst와 동일 
				break;
			case "back":
				if (dq.isEmpty()) {
					sb.append(-1).append("\n");
				} else sb.append(dq.peekLast()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}