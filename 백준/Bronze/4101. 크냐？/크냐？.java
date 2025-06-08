import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 0 0이면 종료
            if (a == 0 && b == 0) {
                break;
            }

            if (a > b) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}