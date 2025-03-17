import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int[] newArr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		newArr = new int[N];
		
		// 배열에 수 넣기
		for (int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 정렬
		mergeSort(arr, 0, N-1);
		
		// 출력
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
	}
	
	public static void mergeSort(int[] arr, int s, int e) {
		// 원소가 하나라면 종료 
		if (s>=e) return;
		
		int mid = s + (e-s) / 2;
		
		// 1. 쪼개기 
		mergeSort(arr, s, mid);
		mergeSort(arr, mid+1, e);
		
		// 2. 병합 
		merge(arr, s, mid, e);
	}
	
	public static void merge(int[] arr, int s, int mid, int e) {
		int i=s;
		int j=mid+1;
		int idx = s;
			
		while (i <= mid && j<=e) {
			if (arr[i] <= arr[j]) newArr[idx++] = arr[i++];
			else newArr[idx++] = arr[j++];
		}
		// 왼쪽 배열 남은 원소 복사 
		while (i<=mid) {
			newArr[idx++] = arr[i++];
		}
	
		// 오른쪽 배열 남은 원소 복사
		while (j<=e) {
			newArr[idx++] = arr[j++];
		}
		
		// 정렬된 배열 원본 배열에 복사 (newArr -> arr)
		for (int k=s; k<=e; k++) {
			arr[k] = newArr[k];
		}
	}
}
