import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int strLength = str.length();
        String[][] numbers = {
                {"0000", "   1", "2222", "3333", "4  4", "5555", "6666", "7777", "8888", "9999"},
                {"0  0", "   1", "   2", "   3", "4  4", "5",    "6",    "   7", "8  8", "9  9"},
                {"0  0", "   1", "2222", "3333", "4444", "5555", "6666", "   7", "8888", "9999"},
                {"0  0", "   1", "2",    "   3", "   4", "   5", "6  6", "   7", "8  8", "   9"},
                {"0000", "   1", "2222", "3333", "   4", "5555", "6666", "   7", "8888", "   9"}
        };

        for (int i = 0; i < strLength; i++) {
            for (int j = 0; j < 5; j++) {
                int digit = str.charAt(i) - '0';
                System.out.print(numbers[j][digit]);

                if(i+j != strLength+3) {
                    System.out.println();
                }
            }

            if(i + 1 != strLength) {
                System.out.println();
            }
        }
    }
}