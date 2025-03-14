import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		CompData[] arr = new CompData[N];
		
		// 배열에 데이터 채우기 
		for (int i=0; i<N; i++) {
			arr[i] = new CompData(Integer.parseInt(br.readLine()), i);
		}
		
		Arrays.sort(arr);
		int max = 0;
		for (int i=0; i<N; i++) {
			if (max < arr[i].index - i) {
				max = arr[i].index - i;
			}
		}
		
		System.out.println(max + 1);
	}
}

class CompData implements Comparable<CompData> {
	int value;
	int index;
	
	public CompData(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(CompData data) {
		return this.value - data.value;
	}
}
