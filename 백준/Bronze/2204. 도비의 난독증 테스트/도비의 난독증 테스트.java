import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();

            int n = Integer.parseInt(line);
            if (n == 0)
                break;

            String[] answerArr = new String[n];

            for (int i = 0; i < n; i++) {
                answerArr[i] = br.readLine();
            }

            Arrays.sort(answerArr, String.CASE_INSENSITIVE_ORDER);

            bw.write(answerArr[0] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}