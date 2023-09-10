import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        System.out.println(A/B);

    }
}
