import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            int min = 101;

            for (int j = 0; j < 7; j++) {

                int num = Integer.parseInt(st.nextToken());

                if (num % 2 == 0) {
                    sum += num;
                    min = Math.min(min, num);
                }
            }

            sb.append(sum).append(" ").append(min).append("\n");
        }

        System.out.print(sb);
        
        br.close();
    }
}