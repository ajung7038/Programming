import java.util.Stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		// 배열 채우기
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Stack<Integer> stack = new Stack<>();
		
		int num = 1; // 오름차순 수
		boolean result = true;
		
		for (int i=0; i<arr.length; i++) {
			int su = arr[i]; // 현재 배열의 수
			if (su >= num) {
				while (su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				// su == num 시 push 후 pop 진행 
				stack.pop();
				sb.append("-\n");
			}
			else {
				int n = stack.pop();
				if (n > su) {
					System.out.println("NO");
					result=false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}
		}
		if (result) System.out.println(sb);
	}
}