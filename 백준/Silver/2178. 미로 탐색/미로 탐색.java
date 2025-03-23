import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static int N, M;
	public static int[][] map;
	public static int[] dx = {0, 1, 0, -1};
	public static int[] dy = {1, 0, -1, 0};
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for (int i=0; i<N; i++) {
			String s = br.readLine();
			for (int j=0; j<M; j++) {
				map[i][j] = s.charAt(j)-'0';
			}
		}
		
		visited = new boolean[N][M];
		visited[0][0] = true;
		BFS(0, 0);
		System.out.println(map[N-1][M-1]);
	}
	
	private static void BFS (int x, int y) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));
		
		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
					continue;
				}
				
				if (visited[nx][ny] || map[nx][ny] == 0) {
					continue;
				}
				q.add(new Point(nx, ny));
				map[nx][ny] = map[p.x][p.y] + 1;
				visited[nx][ny] = true;
			}
		}
	}
}


class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}