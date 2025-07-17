import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int case1 = Integer.parseInt(st.nextToken());
            int case2 = Integer.parseInt(st.nextToken());
            bw.write("Case " + (i + 1) + ": " + (case1 + case2) + "\n");
        }

        bw.flush();
        br.close();
    }
}