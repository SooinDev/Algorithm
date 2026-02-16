import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        a = a % b;

        for (int i = 0; i < n; i++) {
            a = a * 10;

            int digit = a / b;

            a = a % b;
            
            if (i == n - 1)
                bw.write(String.valueOf(digit));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}