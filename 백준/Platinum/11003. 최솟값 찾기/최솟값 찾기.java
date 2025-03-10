import java.io.BufferedReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int L;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		Deque<Node> myDeque = new LinkedList<>();
		for (int i=0; i<N; i++) {
			int now = Integer.parseInt(st.nextToken());
			
			// 새 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임 
			while(!myDeque.isEmpty() && myDeque.getLast().value > now) {
				myDeque.removeLast();
			}
			
			myDeque.addLast(new Node(now, i));
			// 범위에서 벗어난 값은 덱에서 제거
			if (myDeque.getFirst().index <= i-L) {
				myDeque.removeFirst();
			}
			sb.append(myDeque.getFirst().value + " ");
		}
		System.out.println(sb);
		br.close();
	}
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
