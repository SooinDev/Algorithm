import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int maxScore = 0;
        int winner = 0;

        for (int i = 1; i <= 5; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if (sum > maxScore) {
                maxScore = sum;
                winner = i;
            }
        }

        sb.append(winner).append(" ").append(maxScore);

        System.out.print(sb);
        br.close();
    }
}