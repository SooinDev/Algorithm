import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            
            double sum = 0;

            for (int j = 0; j < n; j++) {
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }

            double mean = sum / n;

            double count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > mean) {
                    count++;
                }
            }

            double result = (count / n) * 100;

            bw.write(String.format("%.3f%%\n", result));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}