import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		List<Integer> arr = new ArrayList<>();
		
		for (char c : str.toCharArray()) {
			arr.add(c - '0');
		}
		
		Collections.sort(arr, Collections.reverseOrder());
		
		for (int num : arr) {
			System.out.print(num);
		}
	}
}
