import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int day = Integer.parseInt(br.readLine());
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            int car = Integer.parseInt(st.nextToken());

            if (car == day)
                result++;
        }

        sb.append(result);

        System.out.print(sb);
    }
}