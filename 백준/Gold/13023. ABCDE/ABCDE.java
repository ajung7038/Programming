import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	private static boolean[] visited;
	private static ArrayList<Integer>[] A;
	private static boolean arrive;
	public static void main(String[] args) throws IOException {
		int N; // 노드 개수
		int M; // 에지 개수
		arrive = false;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		A = new ArrayList[N];
		visited = new boolean[N];
		for (int i=0; i<N; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			A[S].add(E);
			A[E].add(S);
		}
		
		for (int i=0; i<N; i++) {
			DFS(i, 1);
			if (arrive) break;
		}
		
		if (arrive) System.out.println("1");
		else System.out.println("0");
	}
	
	private static void DFS(int now, int depth) {
		if (depth == 5 || arrive) {
			arrive = true;
			return;
		}
		visited[now] = true;
		for (int i : A[now]) {
			if (!visited[i]) {
				DFS(i, depth+1);
			}
		}
		visited[now]=false;
	}
}
