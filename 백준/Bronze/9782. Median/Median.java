import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = 1;

        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            int n = Integer.parseInt(st.nextToken());

            if (n == 0)
                break;

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            double median = 0;

            if (n % 2 != 0) {
                median = arr[n / 2];
            }
            else {
                median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
            }

            bw.write(String.format("Case %d: %.1f\n", caseNum, median));

            caseNum++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}