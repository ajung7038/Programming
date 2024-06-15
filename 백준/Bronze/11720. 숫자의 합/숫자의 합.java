import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String nums = br.readLine();
        int num, sum = 0;

        for (int i=0; i<N; i++) {
            num = Integer.parseInt(String.valueOf(nums.charAt(i)));
            sum += num;
        }

        System.out.println(sum);
    }
}
