import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N에 관해 for문 돌면서 숫자 넣기
		int[] arr = new int[N];
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		// M에 관해 for문 돌면서 숫자 넣기 (인덱스 저장을 위한 이차원 배열 사용) 
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		// N에 관해 for문 돌면서 숫자 넣기 
		for (int i=0; i<M; i++) {
			boolean find=false;
			int target = Integer.parseInt(st.nextToken());
			
			// 이진탐색 
			int start = 0;
			int end = arr.length -1;
			while (start <= end) {
				int midi = (start + end) / 2;
				int midv = arr[midi];
				
				if (midv > target) end = midi - 1;
				else if (midv < target) start = midi + 1;
				else {
					find = true;
					break;
				}
			}
			
			if (find) System.out.println(1);
			else System.out.println(0);
		}
	}
}
