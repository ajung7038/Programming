import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

// 주몽의 명령
// for문을 돌며 합이 M이 되는 수를 찾고, count(갑옷 제작 카운트) 1 증가 후 중복을 없애기 위해 재료의 고유한 번호 0으로 만들기.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 재료의 개수
        int N = Integer.parseInt(br.readLine());

        // 갑옷을 만드는데 필요한 수
        int M = Integer.parseInt(br.readLine());

        // 재료들이 가진 고유한 번호를 저장하는 배열
        int[] arr = new int[N];

        // 갑옷 개수
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 재료 번호 저장 (공백 구분)
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int i = 0;
        int j = N-1;
        while (i < j) {
            if (arr[i] + arr[j] < M) i++;
            else if (arr[i] + arr[j] > M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}