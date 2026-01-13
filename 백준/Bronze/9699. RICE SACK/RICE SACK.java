import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = 0;

            for (int j = 0; j < 5; j++) {
                int currentNum = Integer.parseInt(st.nextToken());

                if (currentNum > max) {
                    max = currentNum;
                }
            }

            bw.write("Case #" + i + ": " + max + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}