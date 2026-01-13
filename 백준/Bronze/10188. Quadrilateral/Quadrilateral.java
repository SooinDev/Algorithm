import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int C = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    bw.write("X");
                }
                bw.newLine();
            }

            if (i < T - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}