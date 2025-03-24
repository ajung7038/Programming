import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	static boolean visited[];
	static int[] distance;
	static ArrayList<Node>[] A;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		A = new ArrayList[N+1];
		
		for (int i=0; i<N+1; i++) {
			A[i] = new ArrayList<Node>();
		}
		
		int s, e, v;
		for (int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			while (true) {
				e = Integer.parseInt(st.nextToken());
				if (e == -1) break;
				v = Integer.parseInt(st.nextToken());
				A[s].add(new Node(e, v));
			}
		}
		distance = new int[N+1];
		visited = new boolean[N+1];
		int farthestNode = BFS(1);
		
		// 다시 BFS 호출 
		distance = new int[N+1];
		visited = new boolean[N+1];
		farthestNode = BFS(farthestNode);
		Arrays.sort(distance);
		System.out.println(distance[N]);
	}
	
	private static int BFS (int idx) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(idx);
		visited[idx] = true;
		int maxNode = idx;
		while (!q.isEmpty()) {
			int now_node = q.poll();
			for (Node n : A[now_node]) {
				int e = n.e;
				int v = n.v;
				if (!visited[e]) {
					visited[e] = true;
					q.add(e);
					distance[e] = distance[now_node] + v;
					if (distance[n.e] > distance[maxNode]) maxNode = n.e;
				}
			}
		}
		return maxNode;
	}
}

class Node {
	int e;
	int v;
	public Node(int e, int v) { 
		this.e = e;
		this.v = v;
	}
}