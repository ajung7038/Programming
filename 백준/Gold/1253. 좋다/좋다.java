import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 수의 개수
		int[] nums = new int[N];
		int count = 0; // 좋은 수
		
		// 배열에 받은 수 집어넣기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		for (int k=0; k<N; k++) {
			int i=0; // 두 수의 합 (1)
			int j=N-1; // 두 수의 합 (2)
			int find = nums[k];
			while(i<j) {
				if (nums[i]+nums[j] == find) {
					// nums[k] 가 서로 다른 두 수의 합이어야 함
					if (i!=k && j!=k) {
						count++;
						break;
					} else if (i==k) i++;
					else j--;
				} else if (nums[i]+nums[j] < find) i++;
				else j--;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
