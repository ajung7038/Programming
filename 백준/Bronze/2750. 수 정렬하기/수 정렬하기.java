import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<>();
		
		// 배열에 정렬하려는 값 넣기 
		for (int i=0; i<N; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		arr.sort(null);
		
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
