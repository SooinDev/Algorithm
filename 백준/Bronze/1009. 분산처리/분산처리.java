import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lastDigit = 1;

            for (int j = 0; j < b; j++) {
                lastDigit = (lastDigit * a) % 10;
            }

            if (lastDigit == 0)
                lastDigit = 10;

            sb.append(lastDigit).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}