import java.io.IOException;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n]; // 수열 배열 
		int[] ans = new int[n]; // 정답 배열 
		String[] str = br.readLine().split(" ");
		
		for (int i=0; i<n; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int i = 1; i<n; i++) {
			// 스택이 비어 있지 않고 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
			while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
				ans[stack.pop()] = A[i];
			}
			stack.push(i);
		}
		
		while (!stack.empty()) {
			// 반복문을 다 돌고나왔는데 스택이 비어 있지 않다면 빌 때까지 스택에 쌓인 index에 -1 넣음
			ans[stack.pop()] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(ans[i] + " ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
